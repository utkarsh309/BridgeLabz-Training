// Create UnitConvertor utility class for unit conversions
import java.util.Scanner;

public class UnitConvertorTwo {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to test all conversions
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        // Display conversion results
        System.out.println("Yards to Feet = " + convertYardsToFeet(yards));
        System.out.println("Feet to Yards = " + convertFeetToYards(feet));
        System.out.println("Meters to Inches = " + convertMetersToInches(meters));
        System.out.println("Inches to Meters = " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters = " + convertInchesToCentimeters(inches));

        // Close scanner
        input.close();
    }
}
