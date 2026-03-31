package csvdatahandling;

import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {

    public static void main(String[] args) {
        String filePath = "students.csv";
        detectDuplicates(filePath);
    }

    public static void detectDuplicates(String filePath) {

        Set<String> seenIds = new HashSet<>();
        boolean duplicateFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0].trim();

                // If ID already exists → duplicate
                if (!seenIds.add(id)) {
                    System.out.println("Duplicate Record: " + line);
                    duplicateFound = true;
                }
            }

            if (!duplicateFound) {
                System.out.println("No duplicate records found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
