package filehandlingandsearch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ComparePerformance {

    public static void main(String[] args) {
    	
        // StringBuilder vs StringBuffer
        int times = 1000000;
        String word = "hello";

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            sb.append(word);
        }

        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder time: " + (endBuilder - startBuilder) + " ns");

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < times; i++) {
            buffer.append(word);
        }

        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer time: " + (endBuffer - startBuffer) + " ns");


        // FileReader vs InputStreamReader
        String filePath = "src/filehandlingandsearch/data.txt";

        long startFR = System.nanoTime();
        int countFR = countWordsFileReader(filePath);
        long endFR = System.nanoTime();

        System.out.println("\nFileReader words: " + countFR);
        System.out.println("FileReader time: " + (endFR - startFR) + " ns");

        long startISR = System.nanoTime();
        int countISR = countWordsInputStreamReader(filePath);
        long endISR = System.nanoTime();

        System.out.println("\nInputStreamReader words: " + countISR);
        System.out.println("InputStreamReader time: " + (endISR - startISR) + " ns");
    }

    // Using FileReader
    public static int countWordsFileReader(String path) {
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }

    // Using InputStreamReader
    public static int countWordsInputStreamReader(String path) {
        int count = 0;

        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }
}

