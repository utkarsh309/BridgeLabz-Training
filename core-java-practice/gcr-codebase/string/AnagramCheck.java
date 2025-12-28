
// Create AnagramCheck class to check whether two texts are anagrams
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for two texts
        System.out.println("Enter first text:");
        String text1 = input.nextLine();

        System.out.println("Enter second text:");
        String text2 = input.nextLine();

        // Call method to check anagram
        boolean result = isAnagram(text1, text2);

        // Display result
        if (result) {
            System.out.println("The given texts are Anagrams");
        } else {
            System.out.println("The given texts are NOT Anagrams");
        }

        // Close scanner
        input.close();
    }

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Remove spaces and convert to lowercase
        text1 = text1.replace(" ", "").toLowerCase();
        text2 = text2.replace(" ", "").toLowerCase();

        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for ASCII characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Step 3: Find frequency of characters in first text
        for (int index = 0; index < text1.length(); index++) {
            frequency1[text1.charAt(index)]++;
        }

        // Step 4: Find frequency of characters in second text
        for (int index = 0; index < text2.length(); index++) {
            frequency2[text2.charAt(index)]++;
        }

        // Step 5: Compare frequencies
        for (int index = 0; index < 256; index++) {
            if (frequency1[index] != frequency2[index]) {
                return false;
            }
        }

        return true;
    }
}
