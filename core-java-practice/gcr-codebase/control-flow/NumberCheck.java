// Create NumberCheck class to check if a number is positive, negative, or zero
import java.util.Scanner;

class NumberCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store number and take input
        int number = input.nextInt();

        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // Close the scanner
        input.close();
    }
}
