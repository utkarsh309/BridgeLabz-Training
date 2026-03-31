import java.util.Scanner;

// Create BmiCalculatorForTeam class
public class BmiCalculatorForTeam {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // 2D array to store weight, height and BMI
        // [row][0] -> weight
        // [row][1] -> height
        // [row][2] -> bmi
        double[][] bmiData = new double[10][3];

        // Take input for 10 persons
        for (int index = 0; index < bmiData.length; index++) {

            System.out.println("Enter weight (kg) of person " + (index + 1));
            bmiData[index][0] = input.nextDouble();

            System.out.println("Enter height (cm) of person " + (index + 1));
            bmiData[index][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBmi(bmiData);

        // Get BMI status
        String[] bmiStatus = getBmiStatus(bmiData);

        // Display result in simple way
        displayResult(bmiData, bmiStatus);

        // Close scanner
        input.close();
    }

    // Method to calculate BMI
    public static void calculateBmi(double[][] bmiData) {

        for (int index = 0; index < bmiData.length; index++) {

            double weight = bmiData[index][0];
            double heightCm = bmiData[index][1];

            // Convert height from cm to meter
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            bmiData[index][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] getBmiStatus(double[][] bmiData) {

        String[] status = new String[bmiData.length];

        for (int index = 0; index < bmiData.length; index++) {

            double bmi = bmiData[index][2];

            if (bmi <= 18.4) {
                status[index] = "Underweight";
            } else if (bmi <= 24.9) {
                status[index] = "Normal";
            } else if (bmi <= 39.9) {
                status[index] = "Overweight";
            } else {
                status[index] = "Obese";
            }
        }

        return status;
    }

    // Method to display result simply
    public static void displayResult(double[][] bmiData, String[] bmiStatus) {

        System.out.println("BMI REPORT");

        for (int index = 0; index < bmiData.length; index++) {

            System.out.println("Person " + (index + 1));
            System.out.println("Height : " + bmiData[index][1] + " cm");
            System.out.println("Weight : " + bmiData[index][0] + " kg");
            System.out.println("BMI    : " + Math.round(bmiData[index][2] * 100) / 100.0);
            System.out.println("Status : " + bmiStatus[index]);
           
        }
    }
}
