import java.util.Scanner;

// Create NumberChecker utility class
public class NumberCheckerFive {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Call methods
        boolean isPerfect = checkPerfectNumber(number);
        boolean isAbundant = checkAbundantNumber(number);
        boolean isDeficient = checkDeficientNumber(number);
        boolean isStrong = checkStrongNumber(number);

        // Display results
        System.out.println("Perfect Number: " + isPerfect);
        System.out.println("Abundant Number: " + isAbundant);
        System.out.println("Deficient Number: " + isDeficient);
        System.out.println("Strong Number: " + isStrong);

        // Close scanner
        input.close();
    }

    // Method to check Perfect Number
    public static boolean checkPerfectNumber(int number) {

        if (number <= 0) {
            return false;
        }

        int sum = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum = sum + divisor;
            }
        }

        return sum == number;
    }

    // Method to check Abundant Number
    public static boolean checkAbundantNumber(int number) {

        if (number <= 0) {
            return false;
        }

        int sum = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum = sum + divisor;
            }
        }

        return sum > number;
    }

    // Method to check Deficient Number
    public static boolean checkDeficientNumber(int number) {

        if (number <= 0) {
            return false;
        }

        int sum = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum = sum + divisor;
            }
        }

        return sum < number;
    }

    // Method to check Strong Number
    // Sum of factorial of digits equals the number
    public static boolean checkStrongNumber(int number) {

        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + findFactorial(digit);
            temp = temp / 10;
        }

        return sum == number;
    }

    // Method to find factorial of a digit
    public static int findFactorial(int digit) {

        int factorial = 1;

        for (int count = 1; count <= digit; count++) {
            factorial = factorial * count;
        }

        return factorial;
    }
}
