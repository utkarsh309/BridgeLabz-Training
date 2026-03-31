package string.level1;

// Create TextToLowerCase class to convert the complete text to lowercase and compare the results
import java.util.Scanner;

public class TextToLowerCase {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create a variable to store text and take input from the user
        String sentence = input.nextLine();

        // Call the method to convert each character to lowercase
        String lowerCaseUserDefinedResult = lowerCaseUserDefined(sentence);

        // Display result of user-defined method
        System.out.println(lowerCaseUserDefinedResult);

        // Convert using built-in method
        String lowerCaseBuiltInResult = sentence.toLowerCase();

        // Display result of built-in method
        System.out.println(lowerCaseBuiltInResult);

        // Call the method to compare the lowercase results
        boolean result = compareString(lowerCaseUserDefinedResult, lowerCaseBuiltInResult);

        // Display the result
        System.out.println("Comparison of both the methods are " + result);

        // Close Scanner
        input.close();
    }

    // User-defined method to convert text to lowercase
    public static String lowerCaseUserDefined(String sentence) {

        // Use StringBuilder to store the string
        StringBuilder lowercase = new StringBuilder();

        // Loop through the sentence to find and convert to lowercase
        for (int index = 0; index < sentence.length(); index++) {

            char currentChar = sentence.charAt(index);

            // Check for uppercase letters
            if (currentChar >= 'A' && currentChar <= 'Z') {
                lowercase.append((char) (currentChar + 32));
            } else {
                lowercase.append(currentChar);
            }
        }
        return lowercase.toString();
    }

    // Method to compare two strings
    public static boolean compareString(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        // Loop through the string characters
        for (int index = 0; index < first.length(); index++) {

            if (first.charAt(index) != second.charAt(index)) {
                return false;
            }
        }
        return true;
    }
}
