package arrays;

// Create MultiplicationResult class to store multiplication results from 6 to 9
import java.util.Scanner;

public class MultiplicationResult {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take input number
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        // Define constants for multiplication range
        int startMultiplier = 6;
        int endMultiplier = 9;
        int arraySize = endMultiplier - startMultiplier + 1;

        // Create integer array to store multiplication results
        int[] multiplicationResult = new int[arraySize];

        // Store multiplication results in array
        for (int index = 0; index < multiplicationResult.length; index++) {
            multiplicationResult[index] = number * (startMultiplier + index);
        }

        // Display multiplication table from array
        for (int index = 0; index < multiplicationResult.length; index++) {
            int multiplier = startMultiplier + index;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[index]);
        }

        // Close the scanner
        input.close();
    }
}
