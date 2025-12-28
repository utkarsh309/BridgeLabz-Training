// Create ChocolateDistribution class to divide chocolates among children
import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate input
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero");
            input.close();
            return;
        }

        // Call method to find chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display result
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);

        // Close scanner
        input.close();
    }

    // Method to find quotient and remainder
    // Quotient = chocolates per child
    // Remainder = remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}
