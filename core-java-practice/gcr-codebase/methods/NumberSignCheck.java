
// Create NumberSignCheck class to check whether a number is positive, negative, or zero
import java.util.Scanner;

public class NumberSignCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method to check the number sign
        int result = checkNumberSign(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        // Close scanner
        input.close();
    }

    // Method to check number sign
    // Returns 1 for positive, -1 for negative, and 0 for zero
    public static int checkNumberSign(int number) {

        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
