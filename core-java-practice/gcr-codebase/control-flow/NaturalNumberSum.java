// Create NaturalNumberSum class to check natural number and calculate sum
import java.util.Scanner;

class NaturalNumberSum {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable and take user input
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {

            // Calculate sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {

            // Display message if number is not natural
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner
        input.close();
    }
}
