package scenerioBased2;
//Create EduQuizGrader class for giving score and feedback

public class EduQuizGrader {

    public static void main(String[] args) {

        // Correct answers for 10 questions
        String[] correctAnswers = {"A", "B", "C", "D", "A","B", "C", "D", "A", "B"};

        // Student answers
        String[] studentAnswers = {"a", "b", "c", "a", "a","b", "d", "d", "a", "c"};

        // Calculate score
        int score = calculateScore(correctAnswers, studentAnswers);

        // Calculate percentage
        double percentage = (score * 100.0) / correctAnswers.length;

        // Display final result
        System.out.println("\nTotal Score: " + score + "/" + correctAnswers.length);
        System.out.println("Percentage: " + percentage + "%");

        // Pass / Fail condition
        if (percentage >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    // Method to calculate score and print feedback
    public static int calculateScore(String[] correct, String[] student) {

        int score = 0;

        for (int i = 0; i < correct.length; i++) {

            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

        return score;
    }
}
