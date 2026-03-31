
// Create StudentVotingEligibility class to check voting eligibility of students
import java.util.Scanner;

public class StudentVotingEligibility {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.println("Enter number of students:");
        int numberOfStudents = input.nextInt();

        // Generate random 2-digit ages for students
        int[] studentAges = generateStudentAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResult = checkVotingEligibility(studentAges);

        // Display result in tabular format
        displayVotingResult(votingResult);

        // Close scanner
        input.close();
    }

    // Method to generate random 2-digit ages for n students
    public static int[] generateStudentAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];

        for (int index = 0; index < ages.length; index++) {
            // Generate random age between 10 and 99
            ages[index] = 10 + (int) (Math.random() * 90);
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int index = 0; index < ages.length; index++) {

            int age = ages[index];
            result[index][0] = String.valueOf(age);

            // Validate age
            if (age < 0) {
                result[index][1] = "false";
            } else if (age >= 18) {
                result[index][1] = "true";
            } else {
                result[index][1] = "false";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayVotingResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        

        for (int index = 0; index < data.length; index++) {
            System.out.println(data[index][0] + "\t" + data[index][1]);
        }
    }
}
