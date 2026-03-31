package string.level1;

// Create IllegalArgumentExceptionExample class to demonstrate IllegalArgumentException
import java.util.Scanner;

public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        String text = input.next();

        // Call method that handles IllegalArgumentException
        handleIllegalArgumentException(text);

        // Close scanner
        input.close();
    }

    // Method that explicitly generates IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {

        // Validate argument
        if (text.length() < 5) {
            throw new IllegalArgumentException("String length must be at least 5");
        }

        
    }

    // Method that handles IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {

        try {
            generateIllegalArgumentException(text);
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException handled successfully "+exception);
        }
    }
}
