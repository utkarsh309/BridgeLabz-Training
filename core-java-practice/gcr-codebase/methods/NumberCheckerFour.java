import java.util.Scanner;

// Create NumberChecker  class
public class NumberCheckerFour {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Call different checks
        boolean isPrime = checkPrime(number);
        boolean isNeon = checkNeon(number);
        boolean isSpy = checkSpy(number);
        boolean isAutomorphic = checkAutomorphic(number);
        boolean isBuzz = checkBuzz(number);

        // Display results
        System.out.println("Prime Number: " + isPrime);
        System.out.println("Neon Number: " + isNeon);
        System.out.println("Spy Number: " + isSpy);
        System.out.println("Automorphic Number: " + isAutomorphic);
        System.out.println("Buzz Number: " + isBuzz);

        // Close scanner
        input.close();
    }

    // Method to check Prime Number
    public static boolean checkPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    // Sum of digits of square equals the number
    public static boolean checkNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        return sum == number;
    }

    // Method to check Spy Number
    // Sum of digits equals product of digits
    public static boolean checkSpy(int number) {

        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        return sum == product;
    }

    // Method to check Automorphic Number
    // Square ends with the number itself
    public static boolean checkAutomorphic(int number) {

        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square = square / 10;
            temp = temp / 10;
        }

        return true;
    }

    // Method to check Buzz Number
    // Divisible by 7 or ends with 7
    public static boolean checkBuzz(int number) {

        return (number % 7 == 0) || (number % 10 == 7);
    }
}
