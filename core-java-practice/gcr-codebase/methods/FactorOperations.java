import java.util.Scanner;

// Create FactorOperations class to find and analyze factors of a number
public class FactorOperations {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);

        // Find sum of factors
        int sumOfFactors = findSumOfFactors(factors);

        // Find product of factors
        int productOfFactors = findProductOfFactors(factors);

        // Find product of cube of factors
        double productOfCube = findProductOfCubeOfFactors(factors);

        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int index = 0; index < factors.length; index++) {
            System.out.println(factors[index]);
        }

        // Display results
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Product of Cube of Factors: " + productOfCube);

        // Close scanner
        input.close();
    }

    // Method to find factors of a number
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop to count factors
        for (int value = 1; value <= number; value++) {
            if (number % value == 0) {
                count++;
            }
        }

        // Create array of exact size
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

    // Method to find greatest factor
    public static int findGreatestFactor(int[] factors) {

        int greatest = factors[0];

        for (int index = 1; index < factors.length; index++) {
            if (factors[index] > greatest) {
                greatest = factors[index];
            }
        }

        return greatest;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int index = 0; index < factors.length; index++) {
            sum = sum + factors[index];
        }

        return sum;
    }

    // Method to find product of factors
    public static int findProductOfFactors(int[] factors) {

        int product = 1;

        for (int index = 0; index < factors.length; index++) {
            product = product * factors[index];
        }

        return product;
    }

    // Method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {

        double product = 1;

        for (int index = 0; index < factors.length; index++) {
            product = product * Math.pow(factors[index], 3);
        }

        return product;
    }
}
