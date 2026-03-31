
// Create UniqueChars class to find unique characters in a string
import java.util.Scanner;

public class UniqueChars {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display result
        System.out.print("Unique characters: ");
        for (int index = 0; index < uniqueCharacters.length; index++) {
            System.out.print(uniqueCharacters[index] + " ");
        }

        // Close scanner
        input.close();
    }

    // Method to find unique characters using given logic
    public static char[] findUniqueCharacters(String text) {

        int length = text.length();

        // Temporary array to store unique characters
        char[] tempArray = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar exists anywhere else in the string
            for (int j = 0; j < length; j++) {
                if (i != j && currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            
            }

            // Store only unique characters
            if (isUnique) {
                tempArray[count] = currentChar;
                count++;
            }
        }

        // Create final array of exact size
        char[] uniqueCharacters = new char[count];
        for (int index = 0; index < count; index++) {
            uniqueCharacters[index] = tempArray[index];
        }

        return uniqueCharacters;
    }
}
