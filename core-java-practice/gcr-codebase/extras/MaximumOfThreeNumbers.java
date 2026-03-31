import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        int[] numbers = takeInput(input);

        // Find maximum number
        int maximum = findMaximum(numbers[0], numbers[1], numbers[2]);

        // Display result
        System.out.println("Maximum number is: " + maximum);

        input.close();
    }

    // Method to take three integer inputs from user
    public static int[] takeInput(Scanner input) {

        int[] values = new int[3];

        System.out.print("Enter first number: ");
        values[0] = input.nextInt();

        System.out.print("Enter second number: ");
        values[1] = input.nextInt();

        System.out.print("Enter third number: ");
        values[2] = input.nextInt();

        return values;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
