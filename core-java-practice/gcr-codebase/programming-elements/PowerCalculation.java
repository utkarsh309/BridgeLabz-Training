// Create PowerCalculation class to calculate power of a number
import java.util.Scanner;

class PowerCalculation {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double base = input.nextDouble();
        double exponent = input.nextDouble();

        // Calculate power using Math.pow
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println("The result of " + base + " raised to the power " + exponent + " is " + result );

        // Close the scanner
        input.close();
    }
}
