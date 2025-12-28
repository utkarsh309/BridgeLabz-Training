// Create QuotientAndRemainder class to find quotient and remainder
import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Validate divisor
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed");
            input.close();
            return;
        }

        // Call method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient is " + result[0]);
        System.out.println("Remainder is " + result[1]);

        // Close scanner
        input.close();
    }

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }
}
