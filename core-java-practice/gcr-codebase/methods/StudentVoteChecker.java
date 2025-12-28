import java.util.Scanner;

// Create StudentVoteChecker class to check voting eligibility of students
public class StudentVoteChecker {

    // Method to check whether a student can vote
    public boolean canStudentVote(int age) {

        // Validate age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create object of StudentVoteChecker class
        StudentVoteChecker checker = new StudentVoteChecker();

        // Define array to store age of 10 students
        int[] ages = new int[10];

        // Take input and check voting eligibility
        for (int index = 0; index < ages.length; index++) {

            // Take age input
            ages[index] = input.nextInt();

            // Check voting eligibility
            boolean canVote = checker.canStudentVote(ages[index]);

            // Display result
            if (ages[index] < 0) {
                System.out.println("Invalid age entered");
            } else if (canVote) {
                System.out.println("The student with age " + ages[index] + " can vote");
            } else {
                System.out.println("The student with age " + ages[index] + " cannot vote");
            }
        }

        // Close scanner
        input.close();
    }
}
