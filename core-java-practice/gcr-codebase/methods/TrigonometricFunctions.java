// Create TrigonometricFunctions class to calculate sine, cosine and tangent
import java.util.Scanner;

public class TrigonometricFunctions {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angleInDegrees = input.nextDouble();

        // Call method to calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angleInDegrees);

        // Display results
        System.out.println("Sine value is " + result[0]);
        System.out.println("Cosine value is " + result[1]);
        System.out.println("Tangent value is " + result[2]);

        // Close scanner
        input.close();
    }

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sineValue = Math.sin(radians);
        double cosineValue = Math.cos(radians);
        double tangentValue = Math.tan(radians);

        // Return results as array
        return new double[]{sineValue, cosineValue, tangentValue};
    }
}
