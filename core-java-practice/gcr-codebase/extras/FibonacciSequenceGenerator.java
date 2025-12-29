import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of terms from user
        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        // Call method to generate Fibonacci sequence
        printFibonacci(terms);

        input.close();
    }

    // Method to calculate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        // Handle invalid input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.println("Fibonacci Sequence:");

        // Print Fibonacci numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
