package SnakeAndLadder;

// Create SnakeAndLadder class to simulate Snake and Ladder
public class SnakeLadderTwoPlayer {

    public static void main(String[] args) {

        // UC-1 Start position 0
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int turn = 1;

        // UC-4 Repeat till player reaches position 100
        while (playerOnePosition < 100 && playerTwoPosition < 100) {

            if (turn == 1) {
                int option = checkOption();
                playerOnePosition = play(1, playerOnePosition, option);

                // Switch turn only if NOT ladder
                if (option != 1) {
                    turn = 2;
                }

            } else {
                int option = checkOption();
                playerTwoPosition = play(2, playerTwoPosition, option);

                // Switch turn only if NOT ladder
                if (option != 1) {
                    turn = 1;
                }
            }
        }

        // Display the result
        if (playerOnePosition == 100) {
            System.out.println("Player One Won");
        } else {
            System.out.println("Player Two Won");
        }
    }

    // Method to roll the dice
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Method to check option
    public static int checkOption() {
        return (int) (Math.random() * 3);
    }

    // Method to play one turn
    public static int play(int player, int playerPosition, int option) {

        int dice = rollDice();
        int previousPosition = playerPosition;

        switch (option) {

            case 0:
                // No Play
                System.out.println("Player " + player + " - No Play");
                break;

            case 1:
                // Ladder
                playerPosition += dice;
                System.out.println("Player " + player + " got Ladder");
                break;

            case 2:
                // Snake
                playerPosition -= dice;
                System.out.println("Player " + player + " bitten by Snake");
                break;
        }

        // UC-5 boundary conditions
        if (playerPosition > 100) {
            playerPosition = previousPosition;
        }

        if (playerPosition < 0) {
            playerPosition = 0;
        }

        // Display position
        System.out.println("Player " + player + " Rolled " + dice +
                           " || Position: " + playerPosition);

        return playerPosition;
    }
}
