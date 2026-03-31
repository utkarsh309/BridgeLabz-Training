import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        int number = takeInput(input);

        // Calculate factorial using recursion
        long result = factorial(number);

        // Display result
        displayResult(number, result);

        input.close();
    }

    // Method to take number input from user
    public static int takeInput(Scanner input) {
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    // Method to display output
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
