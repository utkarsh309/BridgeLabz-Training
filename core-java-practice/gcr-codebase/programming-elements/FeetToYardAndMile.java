// Create FeetToYardAndMile class to convert feet into yards and miles
import java.util.Scanner;

class FeetToYardAndMile {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store distance in feet and take input
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles
        );

        // Close the scanner
        input.close();
    }
}
