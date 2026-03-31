// Create HeightConversion class to convert height from centimeters to feet and inches
import java.util.Scanner;

class HeightConversion {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store height in centimeters and take input
        double heightInCentimeters = input.nextDouble();

        // Convert centimeters to inches
        double heightInInches = heightInCentimeters / 2.54;

        // Calculate height in feet
        int heightInFeet = (int) (heightInInches / 12);

        // Calculate remaining inches
        double heightInRemainingInches = heightInInches % 12;

        // Display the result
        System.out.println("Your Height in cm is " + heightInCentimeters +
                " while in feet is " + heightInFeet +
                " and inches is " + heightInRemainingInches
        );

        // Close the scanner
        input.close();
    }
}
