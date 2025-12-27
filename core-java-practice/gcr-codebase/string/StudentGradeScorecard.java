
// Create StudentGradeScorecard class to calculate percentage and grade
public class StudentGradeScorecard {

    public static void main(String[] args) {

        // Number of students
        int totalStudents = 5;

        // Generate random PCM scores
        int[][] pcmScores = generatePCMScores(totalStudents);

        // Calculate total, average and percentage
        double[][] calculatedValues = calculateScores(pcmScores);

        // Calculate grades
        String[][] grades = calculateGrades(calculatedValues);

        // Display scorecard
        displayScorecard(pcmScores, calculatedValues, grades);
    }

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int totalStudents) {

        int[][] scores = new int[totalStudents][3];

        for (int student = 0; student < totalStudents; student++) {
            scores[student][0] = 10 + (int) (Math.random() * 90); // Physics
            scores[student][1] = 10 + (int) (Math.random() * 90); // Chemistry
            scores[student][2] = 10 + (int) (Math.random() * 90); // Maths
        }

        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateScores(int[][] pcmScores) {

        double[][] values = new double[pcmScores.length][3];

        for (int student = 0; student < pcmScores.length; student++) {

            int total = pcmScores[student][0]
                      + pcmScores[student][1]
                      + pcmScores[student][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            values[student][0] = total;
            values[student][1] = average;
            values[student][2] = percentage;
        }

        return values;
    }

    // Method to calculate grades based on percentage
    public static String[][] calculateGrades(double[][] calculatedValues) {

        String[][] grades = new String[calculatedValues.length][1];

        for (int student = 0; student < calculatedValues.length; student++) {

            double percentage = calculatedValues[student][2];

            if (percentage >= 80) {
                grades[student][0] = "A";
            } else if (percentage >= 70) {
                grades[student][0] = "B";
            } else if (percentage >= 60) {
                grades[student][0] = "C";
            } else if (percentage >= 50) {
                grades[student][0] = "D";
            } else if (percentage >= 40) {
                grades[student][0] = "E";
            } else {
                grades[student][0] = "R";
            }
        }

        return grades;
    }

    // Method to display scorecard in tabular format
    public static void displayScorecard(int[][] pcmScores,
                                        double[][] calculatedValues,
                                        String[][] grades) {

        System.out.println("Phy\tChem\tMath\tTotal\tAverage\t%\tGrade");
        

        for (int student = 0; student < pcmScores.length; student++) {
            System.out.println(
                pcmScores[student][0] + "\t" +
                pcmScores[student][1] + "\t" +
                pcmScores[student][2] + "\t" +
                calculatedValues[student][0] + "\t" +
                calculatedValues[student][1] + "\t" +
                calculatedValues[student][2] + "\t" +
                grades[student][0]
            );
        }
    }
}
