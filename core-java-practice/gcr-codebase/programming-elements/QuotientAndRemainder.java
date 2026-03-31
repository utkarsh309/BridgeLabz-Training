// Create QuotientAndRemainder class to find quotient and remainder of two numbers
import java.util.Scanner;

class QuotientAndRemainder {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculate quotient
        int quotient = number1 / number2;

        // Calculate remainder
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2
        );

        // Close the scanner
        input.close();
    }
}
