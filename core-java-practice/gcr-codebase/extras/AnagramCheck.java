import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Check if strings are anagrams
        boolean isAnagram = checkAnagram(str1, str2);

        // Display result
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    // Method to check whether two strings are anagrams
    public static boolean checkAnagram(String s1, String s2) {

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Array to store frequency of characters
        int[] frequency = new int[256]; // ASCII characters

        // Increase count for first string
        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i)]++;
        }

        // Decrease count for second string
        for (int i = 0; i < s2.length(); i++) {
            frequency[s2.charAt(i)]--;
        }

        // If any frequency is not zero, not an anagram
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
