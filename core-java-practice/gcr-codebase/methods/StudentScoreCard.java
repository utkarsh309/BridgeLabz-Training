import java.util.Scanner;

// Create StudentScoreCard class
public class StudentScoreCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate random PCM marks
        int[][] pcmMarks = generatePCMScores(numberOfStudents);

        // Calculate total, average, percentage and grade
        String[][] result = calculateResults(pcmMarks);

        // Display scorecard
        displayScoreCard(pcmMarks, result);

        input.close();
    }

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 51) + 50; // Physics
            scores[i][1] = (int) (Math.random() * 51) + 50; // Chemistry
            scores[i][2] = (int) (Math.random() * 51) + 50; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, percentage and grade
    public static String[][] calculateResults(int[][] pcmMarks) {

        String[][] result = new String[pcmMarks.length][4];

        for (int i = 0; i < pcmMarks.length; i++) {

            int total = pcmMarks[i][0] + pcmMarks[i][1] + pcmMarks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            String grade = calculateGrade(percentage);

            result[i][0] = String.valueOf(total);
            result[i][1] = String.valueOf(average);
            result[i][2] = String.valueOf(percentage);
            result[i][3] = grade;
        }
        return result;
    }

    // Method to calculate grade
    public static String calculateGrade(double percentage) {

        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] pcmMarks, String[][] result) {

        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcmMarks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    pcmMarks[i][0] + "\t" +
                    pcmMarks[i][1] + "\t" +
                    pcmMarks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    result[i][3]
            );
        }
    }
}
