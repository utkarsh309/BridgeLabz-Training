import java.util.Scanner;
//Create class CountVowelsAndConsonants to count vowels and consonants in a string
public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Variables to store count of vowels and consonants
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase for easy comparison
        text = text.toLowerCase();

        // Loop through each character of the string
        for (int index = 0; index < text.length(); index++) {

            // Get character at current index
            char ch = text.charAt(index);

            // Check if the character is an alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    // If not vowel, it is a consonant
                    consonants++;
                }
            }
        }

        // Display the result
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        // Close the scanner
        input.close();
    }
}
