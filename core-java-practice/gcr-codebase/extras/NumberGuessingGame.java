import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Type: high, low, or correct");
       

        boolean isGuessedCorrectly = false;

        while (!isGuessedCorrectly) {

            int guess = generateGuess();
            System.out.println("Computer guesses: " + guess);

            String feedback = getUserFeedback(input);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed your number correctly!");
                isGuessedCorrectly = true;
            } else {
                updateRange(guess, feedback);
            }
        }

        input.close();
    }

    // Method to generate a random guess within range
    public static int generateGuess() {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Method to take feedback from user
    public static String getUserFeedback(Scanner input) {
        System.out.print("Is the guess high, low, or correct? ");
        return input.nextLine();
    }

    // Method to update guessing range based on feedback
    public static void updateRange(int guess, String feedback) {

        if (feedback.equalsIgnoreCase("high")) {
            high = guess - 1;
        } else if (feedback.equalsIgnoreCase("low")) {
            low = guess + 1;
        } else {
            System.out.println("Invalid feedback. Please enter high, low, or correct.");
        }
    }
}
