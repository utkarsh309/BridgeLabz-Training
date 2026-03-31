package streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
    }
}
