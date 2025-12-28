
// Create CharacterFrequencyUsingUniqueCharacters class
import java.util.Scanner;

public class CharacterFrequencyUnique {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find and display character frequencies
        findAndDisplayCharacterFrequency(text);

        // Close scanner
        input.close();
    }

    // Method to find frequency of characters using unique characters
    public static void findAndDisplayCharacterFrequency(String text) {

        int length = text.length();

        // ASCII frequency array
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int index = 0; index < length; index++) {
            frequency[text.charAt(index)]++;
        }

        System.out.println("\nCharacter\tFrequency");
        

        // Find unique characters and display their frequency
        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, print frequency
            if (isUnique) {
                System.out.println(currentChar + "\t\t" + frequency[currentChar]);
            }
        }
    }
}
