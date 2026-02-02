package csvdatahandling;

import java.io.*;
import java.util.*;

public class LargeCSVReader {

    private static final int BATCH_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "large_file.csv";
        readLargeCSV(filePath);
    }

    public static void readLargeCSV(String filePath) {

        int totalRecordsProcessed = 0;
        List<String> batch = new ArrayList<>(BATCH_SIZE);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                batch.add(line);

                if (batch.size() == BATCH_SIZE) {
                    totalRecordsProcessed += processBatch(batch);
                    batch.clear(); //free memory
                }
            }

            // Process remaining records less than 100
            if (!batch.isEmpty()) {
                totalRecordsProcessed += processBatch(batch);
                batch.clear();
            }

            System.out.println("Total records processed: " + totalRecordsProcessed);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file.");
            e.printStackTrace();
        }
    }

    // Process one batch of records
    private static int processBatch(List<String> batch) {

        System.out.println("Processed batch of size: " + batch.size());
        return batch.size();
    }
}