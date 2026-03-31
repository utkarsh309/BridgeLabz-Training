// Create FactorsOperations class to find factors and related operations
import java.util.Scanner;

public class FactorsOperations {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            input.close();
            return;
        }

        // Call method to find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors of " + number + " are:");
        for (int index = 0; index < factors.length; index++) {
            System.out.print(factors[index] + " ");
        }
        System.out.println();

        // Call methods for calculations
        int sum = findSumOfFactors(factors);
        int sumOfSquares = findSumOfSquaresOfFactors(factors);
        int product = findProductOfFactors(factors);

        // Display results
        System.out.println("Sum of factors = " + sum);
        System.out.println("Sum of squares of factors = " + sumOfSquares);
        System.out.println("Product of factors = " + product);

        // Close scanner
        input.close();
    }

    // Method to find factors and return as array
    public static int[] findFactors(int number) {

        // First loop to count factors
        int count = 0;
        for (int value = 1; value <= number; value++) {
            if (number % value == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int value = 1; value <= number; value++) {
            if (number % value == 0) {
                factors[index] = value;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;
        for (int index = 0; index < factors.length; index++) {
            sum = sum + factors[index];
        }
        return sum;
    }

    // Method to find product of factors (using int only)
    public static int findProductOfFactors(int[] factors) {

        int product = 1;
        for (int index = 0; index < factors.length; index++) {
            product = product * factors[index];
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static int findSumOfSquaresOfFactors(int[] factors) {

        int sumOfSquares = 0;
        for (int index = 0; index < factors.length; index++) {
            sumOfSquares = sumOfSquares + (int) Math.pow(factors[index], 2);
        }
        return sumOfSquares;
    }
}
