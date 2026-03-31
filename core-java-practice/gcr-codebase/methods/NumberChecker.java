import java.util.Scanner;

// Create NumberChecker class to analyze digits of a number
public class NumberChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        int number = input.nextInt();

        // Count digits
        int digitCount = findDigitCount(number);

        // Store digits in array
        int[] digits = storeDigits(number, digitCount);

        // Check duck number
        boolean isDuck = isDuckNumber(digits);

        // Check Armstrong number
        boolean isArmstrong = isArmstrongNumber(digits, number);

        // Find largest and second largest
        int[] largestValues = findLargestAndSecondLargest(digits);

        // Find smallest and second smallest
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        // Display results
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Duck Number: " + isDuck);
        System.out.println("Armstrong Number: " + isArmstrong);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);

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

    // Method to store digits in an array
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

    // Method to check Duck Number
    // As per hint: number having any non-zero digit
    public static boolean isDuckNumber(int[] digits) {

        for (int index = 0; index < digits.length; index++) {
            if (digits[index] != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {

        int sum = 0;
        int power = digits.length;

        for (int index = 0; index < digits.length; index++) {
            sum = sum + (int) Math.pow(digits[index], power);
        }

        return sum == originalNumber;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int index = 0; index < digits.length; index++) {

            if (digits[index] > largest) {
                secondLargest = largest;
                largest = digits[index];
            } else if (digits[index] > secondLargest && digits[index] != largest) {
                secondLargest = digits[index];
            }
        }

        return new int[] { largest, secondLargest };
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int index = 0; index < digits.length; index++) {

            if (digits[index] < smallest) {
                secondSmallest = smallest;
                smallest = digits[index];
            } else if (digits[index] < secondSmallest && digits[index] != smallest) {
                secondSmallest = digits[index];
            }
        }

        return new int[] { smallest, secondSmallest };
    }
}
