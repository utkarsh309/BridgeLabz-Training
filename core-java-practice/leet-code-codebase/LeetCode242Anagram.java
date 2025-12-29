
import java.util.Scanner;

public class LeetCode242Anagram {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take first string input
        System.out.println("Enter first string:");
        String firstString = input.nextLine();

        // Take second string input
        System.out.println("Enter second string:");
        String secondString = input.nextLine();

        // Call isAnagram method
        boolean result = isAnagram(firstString, secondString);

        // Display result
        System.out.println("Are the two strings anagrams? " + result);

        // Close scanner
        input.close();
    }

    // Method to check whether two strings are anagrams
    public static boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency arrays for lowercase letters
        int[] array = new int[26];
        

        // Count frequency of each character
        for (int index = 0; index < s.length(); index++) {
            array[s.charAt(index) - 'a']++;
            array[t.charAt(index) - 'a']--;
        }
        // Check if all frequencies are zero
        for (int count : array) {
            if (count != 0) {
                return false;
            }
        }   
        return true;
    }
}
