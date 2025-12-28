import java.util.Scanner;

// Create NumberAnalysis class
public class NumberAnalysis {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Check each number
        for (int index = 0; index < numbers.length; index++) {

            int value = numbers[index];

            if (isPositive(value)) {

                if (isEven(value)) {
                    System.out.println(value + " is Positive and Even");
                } else {
                    System.out.println(value + " is Positive and Odd");
                }

            } else if (value < 0) {
                System.out.println(value + " is Negative");
            } else {
                System.out.println(value + " is Zero");
            }
        }

        // Compare first and last element
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element");
        } else if (comparisonResult == 0) {
            System.out.println("First and last elements are equal");
        } else {
            System.out.println("First element is less than last element");
        }

        // Close scanner
        input.close();
    }

    // Method to check if number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2
    // Returns 0 if equal
    // Returns -1 if number1 < number2
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}
