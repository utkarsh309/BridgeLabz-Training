// Create WindChillCalculator class to calculate wind chill temperature
import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for temperature and wind speed
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Validate input
        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative");
            input.close();
            return;
        }

        // Call method to calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("The wind chill temperature is " + windChill);

        // Close scanner
        input.close();
    }

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill =
                35.74
                + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }
}
