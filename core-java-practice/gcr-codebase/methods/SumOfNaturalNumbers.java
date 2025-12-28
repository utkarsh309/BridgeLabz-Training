// Create SumOfNaturalNumbers class to find sum of n natural numbers using loop
import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for n
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a valid natural number");
            input.close();
            return;
        }

        // Call method to find sum
        int sum = findSumOfNaturalNumbers(number);

        // Display result
        System.out.println("The sum of first " + number + " natural numbers is " + sum);

        // Close scanner
        input.close();
    }

    // Method to find sum of n natural numbers using loop
    public static int findSumOfNaturalNumbers(int number) {

        int sum = 0;

        // Loop from 1 to n
        for (int counter = 1; counter <= number; counter++) {
            sum = sum + counter;
        }

        return sum;
    }
}
