package arrays;

// Create FactorArrayCalculator class to find and store factors of a number
import java.util.Scanner;

public class FactorArrayCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        int number = input.nextInt();

        // Validate natural number
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            input.close();
            return;
        }

        // Create variables to manage dynamic array
        int maxFactor = 10;
        int index = 0;

        // Create array to store factors
        int[] factors = new int[maxFactor];

        // Loop from 1 to number to find factors
        for (int value = 1; value <= number; value++) {

            // Check if value is a factor
            if (number % value == 0) {

                // Resize array if it is full
                if (index == maxFactor) {

                    maxFactor = maxFactor * 2;
                    int[] tempArray = new int[maxFactor];

                    for (int position = 0; position < factors.length; position++) {
                        tempArray[position] = factors[position];
                    }

                    factors = tempArray;
                }

                // Store factor
                factors[index] = value;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int position = 0; position < index; position++) {
            System.out.println(factors[position]);
        }

        // Close scanner
        input.close();
    }
}
