

// Create CharacterFrequency class to find frequency of characters in a string
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call method to find character frequencies
        String[][] characterFrequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("\nCharacter\tFrequency");

        for (int index = 0; index < characterFrequencies.length; index++) {
            System.out.println(
                characterFrequencies[index][0] + "\t" +
                characterFrequencies[index][1]
            );
        }

        // Close scanner
        input.close();
    }

    // Method to find frequency of characters using charAt()
    public static String[][] findCharacterFrequency(String text) {

        // Frequency array for all ASCII characters
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);
            frequency[currentChar]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);
            if (frequency[currentChar] > 0) {
                uniqueCount++;
                frequency[currentChar] = -frequency[currentChar]; 
            }
        }

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];
        int resultIndex = 0;

        // Reset frequency array and recount
        frequency = new int[256];
        for (int index = 0; index < text.length(); index++) {
            frequency[text.charAt(index)]++;
        }

        // Store character and frequency
        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);

            if (frequency[currentChar] > 0) {
                result[resultIndex][0] = String.valueOf(currentChar);
                result[resultIndex][1] = String.valueOf(frequency[currentChar]);
                resultIndex++;
                frequency[currentChar] = 0;
            }
        }

        return result;
    }
}
