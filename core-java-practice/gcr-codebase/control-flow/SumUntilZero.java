// Create SumUntilZero class to find sum of numbers until user enters zero
import java.util.Scanner;

class SumUntilZero {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store total sum
        double total = 0.0;

        // Create variable to store user input
        double number = input.nextDouble();

        // Continue adding numbers until user enters 0
        while (number != 0) {
            total = total + number;
            number = input.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close the scanner
        input.close();
    }
}
