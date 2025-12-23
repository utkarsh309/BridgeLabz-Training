// Create NaturalNumberSumCheck class to find sum using loop and formula
import java.util.Scanner;

class NaturalNumberSumCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Check if number is a natural number
        if (number >= 0) {

            // Calculate sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Calculate sum using while loop
            int loopSum = 0;
            int counter = 1;

            while (counter <= number) {
                loopSum = loopSum + counter;
                counter++;
            }

            // Compare both results
            if (formulaSum == loopSum) {
                System.out.println("The sum of " + number + " natural numbers is " + loopSum + " and both results are correct");
            } else {
                System.out.println("The results are not matching");
            }

        } else {

            // Display message if not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner
        input.close();
    }
}
