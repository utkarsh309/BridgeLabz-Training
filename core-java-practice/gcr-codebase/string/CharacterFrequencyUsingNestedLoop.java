
// Create CharacterFrequencyUsingNestedLoop class
import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoop {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call method to find character frequency
        String[] result = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter -> Frequency");

        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }

        // Close scanner
        input.close();
    }

    // Method to find character frequency using nested loops
    public static String[] findCharacterFrequency(String text) {

        // Convert string to character array
        char[] characters = text.toCharArray();
        int length = characters.length;

        // Array to store frequency of each character
        int[] frequency = new int[length];

        // Nested loop to find frequency
        for (int i = 0; i < length; i++) {

            // Skip already counted characters
            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int index = 0; index < length; index++) {
            if (characters[index] != '0') {
                uniqueCount++;
            }
        }

        // Create 1D String array to store result
        String[] result = new String[uniqueCount];
        int resultIndex = 0;

        for (int index = 0; index < length; index++) {
            if (characters[index] != '0') {
                result[resultIndex] = characters[index] + " -> " + frequency[index];
                resultIndex++;
            }
        }

        return result;
    }
}
