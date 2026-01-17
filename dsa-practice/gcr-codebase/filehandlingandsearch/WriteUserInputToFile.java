package filehandlingandsearch;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class WriteUserInputToFile {

    public static void main(String[] args) {

        String filePath = "src/filehandlingandsearch/output.txt";  // File where data will be saved

        try {
            // Read input from keyboard
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Write data to file
            FileWriter fileWriter = new FileWriter(filePath, true); // true = append mode

            System.out.println("Enter text (type 'exit' to stop):");

            String input;

            // Read until user types "exit"
            while (!(input = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input + "\n");  // write line to file
            }

            System.out.println("Data saved to file successfully.");

        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}

