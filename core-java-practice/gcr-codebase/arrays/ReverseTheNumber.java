package arraysLevel2;

// Create ReverseTheNumber class to reverse the number using array
import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        int number = input.nextInt();

        // Validate natural number
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            input.close();
            return;
        }

        // Create variables to count digits
        int tempNumber = number;
        int digitCount = 0;

        // Count digits
        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Create array to store digits
        int[] digits = new int[digitCount];

        // Reset tempNumber to extract digits
        tempNumber = number;
        int index = 0;

        // Store digits in array
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }

        // Display reversed number using array
        System.out.print("The reversed number is ");
        for (int position = 0; position < digits.length; position++) {
            System.out.print(digits[position]);
        }

        // Close scanner
        input.close();
    }
}
