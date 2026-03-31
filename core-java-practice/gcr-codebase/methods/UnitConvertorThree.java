// Create UnitConvertor utility class for temperature, weight, and volume conversions
import java.util.Scanner;

public class UnitConvertorThree {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method to test all conversions
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter temperature in Fahrenheit: ");
        double farhenheit = input.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();

        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();

        // Display conversion results
        System.out.println("Fahrenheit to Celsius = " + convertFarhenheitToCelsius(farhenheit));
        System.out.println("Celsius to Fahrenheit = " + convertCelsiusToFarhenheit(celsius));
        System.out.println("Pounds to Kilograms = " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds = " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters = " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons = " + convertLitersToGallons(liters));

        // Close scanner
        input.close();
    }
}
