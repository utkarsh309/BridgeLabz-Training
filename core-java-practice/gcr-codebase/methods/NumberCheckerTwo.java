import java.util.Scanner;

// Create NumberChecker  class
public class NumberCheckerTwo {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Find digit count
        int digitCount = findDigitCount(number);

        // Store digits in array
        int[] digits = storeDigits(number, digitCount);

        // Find sum of digits
        int sumOfDigits = findSumOfDigits(digits);

        // Find sum of squares of digits
        int sumOfSquares = findSumOfSquaresOfDigits(digits);

        // Check Harshad number
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);

        // Find frequency of digits
        int[][] digitFrequency = findDigitFrequency(digits);

        // Display results
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Sum of Digits: " + sumOfDigits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        System.out.println("Harshad Number: " + isHarshad);

        System.out.println("\nDigit  Frequency");
        for (int index = 0; index < digitFrequency.length; index++) {
            if (digitFrequency[index][1] > 0) {
                System.out.println(digitFrequency[index][0] + "      " + digitFrequency[index][1]
                );
            }
        }

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

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {

        int sum = 0;

        for (int index = 0; index < digits.length; index++) {
            sum = sum + digits[index];
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static int findSumOfSquaresOfDigits(int[] digits) {

        int sum = 0;

        for (int index = 0; index < digits.length; index++) {
            sum = sum + (int) Math.pow(digits[index], 2);
        }

        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {

        if (sumOfDigits == 0) {
            return false;
        }

        return number % sumOfDigits == 0;
    }

    // Method to find frequency of each digit
    // 2D array → column 0 = digit, column 1 = frequency
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int digit = 0; digit < 10; digit++) {
            frequency[digit][0] = digit;
        }

        // Count frequency
        for (int index = 0; index < digits.length; index++) {
            frequency[digits[index]][1]++;
        }

        return frequency;
    }
}
