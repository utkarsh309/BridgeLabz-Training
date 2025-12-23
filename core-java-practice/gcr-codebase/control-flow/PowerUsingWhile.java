package controlFlow;

// Create PowerUsingWhile class to calculate power of a number using while loop
import java.util.Scanner;

class PowerUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();
        int power = input.nextInt();

        // Check if both inputs are positive integers
        if (number > 0 && power > 0) {

            // Create variable to store result
            int result = 1;

            // Create counter variable
            int counter = 1;

            // Calculate power using while loop
            while (counter <= power) {
                result = result * number;
                counter++;
            }

            // Display the result
            System.out.println(result);

        } else {
            System.out.println("Please enter positive integers only");
        }

        // Close the scanner
        input.close();
    }
}
