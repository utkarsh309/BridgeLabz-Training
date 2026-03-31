package com.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;


public class MergeJsonFiles {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read both JSON files
            JsonNode json1 = mapper.readTree(new File("user1.json"));
            JsonNode json2 = mapper.readTree(new File("user2.json"));

            // Create merged JSON object
            ObjectNode mergedJson = mapper.createObjectNode();

            // Add all fields from first JSON
            mergedJson.setAll((ObjectNode) json1);

            // Add all fields from second JSON
            mergedJson.setAll((ObjectNode) json2);

            // Print merged JSON
            System.out.println(mergedJson);

        } catch (Exception e) {
            e.getMessage();
        }
    }
}