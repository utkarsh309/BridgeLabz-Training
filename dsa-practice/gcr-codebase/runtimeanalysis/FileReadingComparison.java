package runtimeanalysis;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingComparison {

    // FileReader
    public static long readUsingFileReader(String filePath) throws IOException {

        FileReader reader = new FileReader(filePath);
        int character;
        long count = 0;

        while ((character = reader.read()) != -1) {
            count++;   // counting characters read
        }

        reader.close();
        return count;
    }

    // InputStreamReader
    public static long readUsingInputStreamReader(String filePath) throws IOException {

        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        int character;
        long count = 0;

        while ((character = reader.read()) != -1) {
            count++;   // counting characters read
        }

        reader.close();
        return count;
    }

    public static void main(String[] args) {

        String filePath = "largefile.txt";  

        try {

            // FileReader timing
            long start1 = System.nanoTime();
            long count1 = readUsingFileReader(filePath);
            long end1 = System.nanoTime();

            System.out.println("FileReader Time: " +(end1 - start1) / 1_000_000.0 + " ms");
            System.out.println("Characters Read (FileReader): " + count1);

            // InputStreamReader timing
            long start2 = System.nanoTime();
            long count2 = readUsingInputStreamReader(filePath);
            long end2 = System.nanoTime();

            System.out.println("\nInputStreamReader Time: " +(end2 - start2) / 1_000_000.0 + " ms");
            System.out.println("Characters Read (InputStreamReader): " + count2);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
