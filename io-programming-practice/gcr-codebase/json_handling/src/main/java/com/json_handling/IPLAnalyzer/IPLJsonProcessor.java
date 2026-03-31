package com.json_handling.IPLAnalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class IPLJsonProcessor {

    public static void censorJson(String inputFile, String outputFile) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootArray = mapper.readTree(new File(inputFile));

        for (JsonNode match : rootArray) {
            ObjectNode obj = (ObjectNode) match;

            // Mask teams
            obj.put("team1", IPLCensorUtil.maskTeamName(obj.get("team1").asText()));
            obj.put("team2", IPLCensorUtil.maskTeamName(obj.get("team2").asText()));
            obj.put("winner", IPLCensorUtil.maskTeamName(obj.get("winner").asText()));

            // Redact player of match
            obj.put("player_of_match", IPLCensorUtil.redactPlayer());

            // Mask score keys
            ObjectNode scoreNode = (ObjectNode) obj.get("score");
            ObjectNode newScore = mapper.createObjectNode();

            Iterator<Map.Entry<String, JsonNode>> fields = scoreNode.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                String maskedKey = IPLCensorUtil.maskTeamName(entry.getKey());
                newScore.set(maskedKey, entry.getValue());
            }

            obj.set("score", newScore);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(outputFile), rootArray);
    }
}
