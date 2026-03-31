package controlFlow;

// Create GreatestFactorUsingWhile class to calculate greatest factor of the given number
import java.util.Scanner;

public class GreatestFactorUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take a variable to store number
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {

            // Create variable to store greatest factor
            int greatestFactor = 1;

            // Create counter variable starting from number - 1
            int counter = number - 1;

            // Run while loop till counter reaches 1
            while (counter >= 1) {

                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }

                counter--;
            }

            // Display the greatest factor
            System.out.println(greatestFactor);

        } else {
            System.out.println("This is not a positive number");
        }

        // Close the scanner
        input.close();
    }
}
