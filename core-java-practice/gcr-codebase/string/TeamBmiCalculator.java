

// Create TeamBMICalculator class to calculate BMI of 10 persons
import java.util.Scanner;

public class TeamBmiCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Number of team members
        int totalPersons = 10;

        // Create 2D array to store weight and height
        // Column 0 -> Weight (kg), Column 1 -> Height (cm)
        double[][] weightHeight = new double[totalPersons][2];

        // Take user input for weight and height
        for (int index = 0; index < totalPersons; index++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (index + 1));
            weightHeight[index][0] = input.nextDouble();
            weightHeight[index][1] = input.nextDouble();
        }

        // Calculate BMI details
        String[][] bmiDetails = generateBMIDetails(weightHeight);

        // Display BMI report
        displayBMIReport(bmiDetails);

        // Close scanner
        input.close();
    }

    // Method to calculate BMI and status for one person
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {

        // Convert height from cm to meter
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmiValue = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmiValue = Math.round(bmiValue * 100.0) / 100.0;

        // Determine BMI status
        String status;
        if (bmiValue <= 18.4) {
            status = "Underweight";
        } else if (bmiValue <= 24.9) {
            status = "Normal";
        } else if (bmiValue <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return BMI value and status
        return new String[] { String.valueOf(bmiValue), status };
    }

    // Method to generate BMI details for all persons
    public static String[][] generateBMIDetails(double[][] weightHeight) {

        String[][] result = new String[weightHeight.length][4];

        for (int index = 0; index < weightHeight.length; index++) {

            double weight = weightHeight[index][0];
            double height = weightHeight[index][1];

            // Get BMI and status
            String[] bmiResult = calculateBMIAndStatus(weight, height);

            result[index][0] = String.valueOf(height);
            result[index][1] = String.valueOf(weight);
            result[index][2] = bmiResult[0];
            result[index][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display BMI report in tabular format
    public static void displayBMIReport(String[][] bmiDetails) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        

        for (int index = 0; index < bmiDetails.length; index++) {
            System.out.println(
                bmiDetails[index][0] + "\t" +
                bmiDetails[index][1] + "\t" +
                bmiDetails[index][2] + "\t" +
                bmiDetails[index][3]
            );
        }
    }
}
