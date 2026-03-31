package com.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.core.report.ProcessingReport;

import java.io.File;

public class JsonValidation {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Load JSON Schema
            JsonNode schemaNode = objectMapper.readTree(new File("schema.json"));
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            // Load JSON Data
            JsonNode jsonData = objectMapper.readTree(new File("user.json"));

            // Validate JSON
            ProcessingReport report = schema.validate(jsonData);

            if (report.isSuccess()) {
                System.out.println("JSON is valid!");
            } else {
                System.out.println("Invalid JSON!");
                System.out.println(report);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
