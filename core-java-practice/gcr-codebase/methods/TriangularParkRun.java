
// Create TriangularParkRun class to calculate number of rounds to complete 5 km
import java.util.Scanner;

public class TriangularParkRun {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for the three sides of the triangular park (in meters)
        System.out.print("Enter side 1 (in meters): ");
        double sideOne = input.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double sideTwo = input.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double sideThree = input.nextDouble();

        // Validate input
        if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0) {
            System.out.println("Invalid input. All sides must be positive.");
            input.close();
            return;
        }

        // Call method to calculate number of rounds
        double rounds = calculateRounds(sideOne, sideTwo, sideThree);

        // Display result
        System.out.println("Number of rounds required to complete 5 km run is " + rounds);

        // Close scanner
        input.close();
    }

    // Method to calculate number of rounds required to complete 5 km
    public static double calculateRounds(double sideOne, double sideTwo, double sideThree) {

        // Total distance to be covered (5 km = 5000 meters)
        double totalDistanceInMeters = 5000;

        // Calculate perimeter of the triangular park
        double perimeter = sideOne + sideTwo + sideThree;

        // Calculate number of rounds
        double rounds = totalDistanceInMeters / perimeter;

        return rounds;
    }
}
