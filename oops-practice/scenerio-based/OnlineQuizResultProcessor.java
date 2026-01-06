package scenerioBased2;

import java.util.ArrayList;
import java.util.List;

// Main class
public class OnlineQuizResultProcessor {

    public static void main(String[] args) {

        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        List<Integer> allScores = new ArrayList<>();

        try {
            // User 1
            String[] user1Answers = { "A", "B", "C", "D", "A" };
            int score1 = calculateScore(correctAnswers, user1Answers);
            allScores.add(score1);
            System.out.println("User 1 Grade: " + getGrade(score1, correctAnswers.length));

            // User 2
            String[] user2Answers = { "A", "C", "C", "A", "B" };
            int score2 = calculateScore(correctAnswers, user2Answers);
            allScores.add(score2);
            System.out.println("User 2 Grade: " + getGrade(score2, correctAnswers.length));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display all scores
        System.out.println("All User Scores:");
        for (int score : allScores) {
            System.out.println(score);
        }
    }

    // Method to calculate score
    public static int calculateScore(String[] correct, String[] user) throws InvalidQuizSubmissionException {

        // Validate input length
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Number of answers does not match the quiz.");
        }

        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }

        return score;
    }

    // Method to return grade
    public static String getGrade(int score, int totalQuestions) {

        double percentage = (score * 100.0) / totalQuestions;

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}

//Custom Exception
class InvalidQuizSubmissionException extends Exception {

    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

