package collections;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();

        // Start with "1"
        queue.add("1");

        // Repeat n times
        for (int i = 0; i < n; i++) {

            // Take front
            String current = queue.remove();

            // Print it
            System.out.print(current + " ");

            // Add next two binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println("First " + n + " binary numbers:");
        generateBinary(n);
    }
}
