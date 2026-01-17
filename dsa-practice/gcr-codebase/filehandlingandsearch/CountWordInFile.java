package filehandlingandsearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordInFile {

    public static void main(String[] args) {

        String filePath = "src/filehandlingandsearch/data.txt";     // File name
        String targetWord = "java";    // Word to search
        int count = 0;    // Counter

        try {
            // Create BufferedReader using FileReader
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String currentLine;

            // Read file line by line
            while ((currentLine = bufferedReader.readLine()) != null) {

                // Split line into words
                String[] words = currentLine.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Print final result
            System.out.println("The word " + targetWord + " appears " + count + " times.");

        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
