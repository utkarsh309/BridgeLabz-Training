package com.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterByAge {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON array
            JsonNode rootNode = mapper.readTree(new File("user.json"));

            // Loop through records
            for (JsonNode user : rootNode) {
                int age = user.get("age").asInt();

                if (age > 25) {
                    System.out.println(user);
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
