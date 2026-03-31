import java.util.Scanner;

// Create NumberChecker  class
public class NumberCheckerThree {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Find digit count
        int digitCount = findDigitCount(number);

        // Store digits in array
        int[] digits = storeDigits(number, digitCount);

        // Reverse digits array
        int[] reversedDigits = reverseDigitsArray(digits);

        // Compare original and reversed array
        boolean areArraysEqual = compareArrays(digits, reversedDigits);

        // Check palindrome
        boolean isPalindrome = checkPalindrome(digits, reversedDigits);

        // Check duck number
        boolean isDuck = isDuckNumber(digits);

        // Display results
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Palindrome Number: " + isPalindrome);
        System.out.println("Duck Number: " + isDuck);

        // Close scanner
        input.close();
    }

    // Method to find count of digits
    public static int findDigitCount(int number) {

        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number, int digitCount) {

        int[] digits = new int[digitCount];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {

        int[] reversed = new int[digits.length];

        for (int index = 0; index < digits.length; index++) {
            reversed[index] = digits[digits.length - 1 - index];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] first, int[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int index = 0; index < first.length; index++) {
            if (first[index] != second[index]) {
                return false;
            }
        }

        return true;
    }

    // Method to check palindrome using digits
    public static boolean checkPalindrome(int[] digits, int[] reversedDigits) {

        return compareArrays(digits, reversedDigits);
    }

    // Method to check Duck Number
    // As per given hint: number having any non-zero digit
    public static boolean isDuckNumber(int[] digits) {

        for (int index = 0; index < digits.length; index++) {
            if (digits[index] != 0) {
                return true;
            }
        }

        return false;
    }
}
