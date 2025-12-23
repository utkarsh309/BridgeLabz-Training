// Create SumUntilZeroOrNegative class to find sum until user enters zero or negative number
import java.util.Scanner;

class SumUntilZeroOrNegative {

    public static void main(String[] args) {

        // Create Scanner object to take input 
        Scanner input = new Scanner(System.in);

        // Create variable to store total sum
        double total = 0.0;

        // Infinite loop to take user input
        while (true) {
             // Take user input
            double number = input.nextDouble();

            // Check if number is zero or negative
            if (number <= 0) {
                break;
            }

            // Add number to total
            total = total + number;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        // Close the scanner
        input.close();
    }
}
