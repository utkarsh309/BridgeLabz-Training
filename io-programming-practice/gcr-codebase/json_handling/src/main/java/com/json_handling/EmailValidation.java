package com.json_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.core.report.ProcessingReport;

import java.io.File;

public class EmailValidation {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Load schema
            JsonNode schemaNode = mapper.readTree(new File("schema.json"));
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            // Load JSON data
            JsonNode jsonData = mapper.readTree(new File("user.json"));

            // Validate
            ProcessingReport report = schema.validate(jsonData);

            if (report.isSuccess()) {
                System.out.println("Email is valid");
            } else {
                System.out.println("Invalid email");
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}