import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method to check prime
        boolean result = isPrime(number);

        // Display result
        if (result) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        input.close();
    }

    // Method to check whether a number is prime
    public static boolean isPrime(int num) {

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to num-1
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
