package streams;

import java.io.*;

public class FileCopyPerformance {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String source = "largefile.txt";         
        String normalCopy = "normal_copy.txt";
        String bufferedCopy = "buffered_copy.txt";

        // Normal Stream Copy
        try {
            FileInputStream input = new FileInputStream(source);
            FileOutputStream output = new FileOutputStream(normalCopy);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            long start = System.nanoTime();

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            long end = System.nanoTime();

            System.out.println("Unbuffered copy time: " + (end - start) / 1_000_000 + " ms");

            input.close();
            output.close();

        } catch (IOException e) {
            System.out.println("Error in normal copy: " + e.getMessage());
        }

        // Buffered Stream Copy 
        try {
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(bufferedCopy));

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            long start = System.nanoTime();

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            long end = System.nanoTime();

            System.out.println("Buffered copy time: " + (end - start) / 1_000_000 + " ms");

            input.close();
            output.close();

        } catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
    }
}
