import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        // Calculate GCD
        int gcd = calculateGcd(firstNumber, secondNumber);

        // Calculate LCM
        int lcm = calculateLcm(firstNumber, secondNumber, gcd);

        // Display results
        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd);
        System.out.println("LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);

        input.close();
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // Method to calculate LCM using GCD
    public static int calculateLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
