package filehandlingandsearch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFileUsingInputStreamReader {

    public static void main(String[] args) {

        String filePath = "src/filehandlingandsearch/data.txt";   // File name

        try {
            // Read bytes from file
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Convert byte stream to character stream 
            InputStreamReader inputStreamReader =new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

            // Wrap with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String currentLine;

            //Read file line by line
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}

