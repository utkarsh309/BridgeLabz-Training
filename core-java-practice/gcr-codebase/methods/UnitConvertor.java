// Create UnitConvertor class to perform unit conversions
import java.util.Scanner;

public class UnitConvertor {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Call conversion methods and display results
        System.out.println("Kilometers to Miles = " + convertKmToMiles(km));
        System.out.println("Miles to Kilometers = " + convertMilesToKm(miles));
        System.out.println("Meters to Feet = " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters = " + convertFeetToMeters(feet));

        // Close scanner
        input.close();
    }
}
