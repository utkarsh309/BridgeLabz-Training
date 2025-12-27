

// Create RockPaperScissorsGame class to simulate the game
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take input for number of games
        System.out.println("Enter number of games:");
        int numberOfGames = input.nextInt();

        // Create array to store results of each game
        String[] results = new String[numberOfGames];

        // Loop to play games
        for (int index = 0; index < numberOfGames; index++) {

            System.out.println("Enter your choice (rock / paper / scissors):");
            String userChoice = input.next();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);
            results[index] = winner;

            System.out.println("User: " + userChoice +
                               " | Computer: " + computerChoice +
                               " | Winner: " + winner);
        }

        // Calculate statistics
        String[][] statistics = calculateAverageAndPercentage(results);

        // Display statistics
        displayStatistics(statistics);

        // Close scanner
        input.close();
    }

    // Method to generate computer choice using Math.random()
    public static String getComputerChoice() {

        int randomValue = (int) (Math.random() * 3);

        if (randomValue == 0) {
            return "rock";
        } else if (randomValue == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {

        user = user.toLowerCase();
        computer = computer.toLowerCase();

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {

            return "User";
        }

        return "Computer";
    }

    // Method to calculate average and winning percentage
    public static String[][] calculateAverageAndPercentage(String[] results) {

        int userWins = 0;
        int computerWins = 0;

        for (int index = 0; index < results.length; index++) {
            if (results[index].equals("User")) {
                userWins++;
            } else if (results[index].equals("Computer")) {
                computerWins++;
            }
        }

        int totalGames = results.length;

        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        String[][] statistics = new String[2][3];

        statistics[0][0] = "User";
        statistics[0][1] = String.valueOf(userWins);
        statistics[0][2] = String.format("%.2f", userPercentage);

        statistics[1][0] = "Computer";
        statistics[1][1] = String.valueOf(computerWins);
        statistics[1][2] = String.format("%.2f", computerPercentage);

        return statistics;
    }

    // Method to display statistics in simple format
    public static void displayStatistics(String[][] statistics) {

        System.out.println("\nName\tWins\tWin Percentage");

        for (int index = 0; index < statistics.length; index++) {
            System.out.println(
                statistics[index][0] + "\t" +
                statistics[index][1] + "\t" +
                statistics[index][2]
            );
        }
    }
}
