package controlFlow;

// Create BmiCalculator class to find the BMI of a person
import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create variables to store weight and height and take input
        double weightInKg = input.nextDouble();
        double heightInCentimeter = input.nextDouble();

        // Convert height from centimeter to meter
        double heightInMeter = heightInCentimeter / 100;

        // Calculate BMI
        double bmi = weightInKg / (heightInMeter * heightInMeter);

        // Determine BMI status
        if (bmi <= 18.4) {
            System.out.println("BMI is " + bmi + " and status is Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is " + bmi + " and status is Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("BMI is " + bmi + " and status is Overweight");
        } else {
            System.out.println("BMI is " + bmi + " and status is Obese");
        }

        // Close the scanner
        input.close();
    }
}
