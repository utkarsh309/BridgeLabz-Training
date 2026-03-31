package controlFlow;

// Create MultiplesUsingWhileLoop class to find multiples of a number below 100
import java.util.Scanner;

class MultiplesUsingWhileLoop {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Check if number is a positive integer and less than 100
        if (number > 0 && number < 100) {

            // Initialize counter with the number
            int value = number;

            // Find and print multiples of the number below 100 using while loop
            while (value < 100) {
                System.out.println(value);
                value = value + number;
            }

        } else {
            System.out.println("The number must be positive and less than 100");
        }

        // Close the scanner
        input.close();
    }
}
