package scenerioBased2;

import java.util.Scanner;

//Create ParagraghTextAnalyzer class to find the count,longest and updated paragraph
public class ParagraphTextAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take paragraph input
        System.out.println("Enter a paragraph:");
        String paragraph = input.nextLine();

        // Validate paragraph
        if (isInvalidParagraph(paragraph)) {
            System.out.println("Invalid input: ");
            input.close();
            return;
        }

        // Count words
        int wordCount = countWords(paragraph);
        System.out.println("Total Words: " + wordCount);

        // Find longest word
        String longestWord = findLongestWord(paragraph);
        System.out.println("Longest Word: " + longestWord);

        // Take inputs for replace operation
        System.out.print("Enter word to replace: ");
        String oldWord = input.next();

        System.out.print("Enter new word: ");
        String newWord = input.next();

        // Replace word
        String updatedParagraph = replaceWord(paragraph, oldWord, newWord);
        System.out.println("Updated Paragraph:");
        System.out.println(updatedParagraph);

        // Close scanner
        input.close();
    }

    // Method to validate paragraph
    public static boolean isInvalidParagraph(String text) {
        return text == null || text.trim().isEmpty();
    }

    // Method to count words using split()
    public static int countWords(String text) {

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // Method to find longest word using split()
    public static String findLongestWord(String text) {

        String[] words = text.trim().split("\\s+");
        String longestWord = words[0];

        for (int index = 1; index < words.length; index++) {
            if (words[index].length() > longestWord.length()) {
                longestWord = words[index];
            }
        }
        return longestWord;
    }

    // Method to replace word 
    public static String replaceWord(String text, String oldWord, String newWord) {

        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equalsIgnoreCase(oldWord)) {
                result.append(newWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
