
// Create PalindromeCheck class to check whether a text is palindrome
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text:");
        String text = input.nextLine();

        // Logic 1: Using start and end index comparison
        boolean result1 = isPalindromeUsingLoop(text);

        // Logic 2: Using recursion
        boolean result2 = isPalindromeUsingRecursion(text, 0, text.length() - 1);

        // Logic 3: Using character arrays
        boolean result3 = isPalindromeUsingArray(text);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Using Loop Logic : " + result1);
        System.out.println("Using Recursion Logic : " + result2);
        System.out.println("Using Array Logic : " + result3);

        // Close scanner
        input.close();
    }

    // Logic 1: Compare characters using loop
    public static boolean isPalindromeUsingLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseText(text);

        // Compare original and reverse arrays
        for (int index = 0; index < original.length; index++) {
            if (original[index] != reverse[index]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse string using charAt()
    public static char[] reverseText(String text) {

        int length = text.length();
        char[] reversed = new char[length];
        int index = 0;

        for (int position = length - 1; position >= 0; position--) {
            reversed[index] = text.charAt(position);
            index++;
        }
        return reversed;
    }
}
