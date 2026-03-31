// Create NaturalNumberSumComparison class to compare recursive and formula results
import java.util.Scanner;

public class NaturalNumberSumComparison {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate natural number
        if (number <= 0) {
            System.out.println("The number is not a natural number");
            input.close();
            return;
        }

        // Call recursive method
        int recursiveSum = findSumUsingRecursion(number);

        // Call formula method
        int formulaSum = findSumUsingFormula(number);

        // Display results
        System.out.println("Sum using recursion = " + recursiveSum);
        System.out.println("Sum using formula  = " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct");
        } else {
            System.out.println("Results do not match");
        }

        // Close scanner
        input.close();
    }

    // Method to find sum of n natural numbers using recursion
    public static int findSumUsingRecursion(int number) {

        // Base condition
        if (number == 1) {
            return 1;
        }

        // Recursive call
        return number + findSumUsingRecursion(number - 1);
    }

    // Method to find sum of n natural numbers using formula
    public static int findSumUsingFormula(int number) {

        return (number * (number + 1)) / 2;
    }
}
