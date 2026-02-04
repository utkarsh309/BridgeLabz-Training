package com.json_handling;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;
import java.util.Map;

public class CsvToJson {

    public static void main(String[] args) {
        try {
        	
            // CSV mapper
            CsvMapper csvMapper = new CsvMapper();

            // CSV schema with header
            CsvSchema schema = CsvSchema.emptySchema().withHeader();

            // Read CSV file
            MappingIterator<Map<String, String>> iterator =
                    csvMapper.readerFor(Map.class)
                             .with(schema)
                             .readValues(new File("data.csv"));

            List<Map<String, String>> rows = iterator.readAll();

            // Convert to JSON
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writeValueAsString(rows);

            System.out.println(json);

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
