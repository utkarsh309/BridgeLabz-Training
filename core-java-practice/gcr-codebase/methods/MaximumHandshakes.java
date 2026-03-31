
// Create MaximumHandshakes class to calculate maximum number of handshakes
import java.util.Scanner;

public class MaximumHandshakes {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for handshakes");
            input.close();
            return;
        }

        // Call method to calculate handshakes
        int totalHandshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("Maximum number of handshakes is " + totalHandshakes);

        // Close scanner
        input.close();
    }

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {

        // Combination formula: n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        return handshakes;
    }
}
