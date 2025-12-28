// Create DeckOfCards class to create, shuffle and distribute cards
import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Calculate number of cards
        int numberOfCards = suits.length * ranks.length;

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle the deck
        shuffleDeck(deck);

        // Take input for players and cards
        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();

        // Distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        // Print players and their cards
        printPlayersCards(distributedCards);

        // Close scanner
        input.close();
    }

    // Method to initialize deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int index = 0;
        String[] deck = new String[suits.length * ranks.length];

        for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {
            for (int rankIndex = 0; rankIndex < ranks.length; rankIndex++) {
                deck[index] = ranks[rankIndex] + " of " + suits[suitIndex];
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        int totalCardsRequired = players * cardsPerPlayer;

        if (totalCardsRequired > deck.length) {
            System.out.println("Not enough cards to distribute");
            return new String[0][0];
        }

        String[][] playersCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int player = 0; player < players; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playersCards[player][card] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playersCards;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {

        for (int player = 0; player < playersCards.length; player++) {

            System.out.println("\nPlayer " + (player + 1) + " cards:");

            for (int card = 0; card < playersCards[player].length; card++) {
                System.out.println(playersCards[player][card]);
            }
        }
    }
}
