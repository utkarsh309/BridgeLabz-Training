package scenerioBased;

//Create BmiFitnessTracker class to calculate BMI and determine weight status
import java.util.Scanner;

class BmiFitnessTracker {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Take user input for weight (kg) and height (meters)
     double weightInKg = input.nextDouble();
     double heightInMeters = input.nextDouble();

     // Calculate BMI using standard formula
     double bmi = weightInKg / (heightInMeters * heightInMeters);

     // Determine BMI status based on given table
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
