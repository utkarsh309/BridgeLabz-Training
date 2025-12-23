// Create AverageOfThreeNumbers class to calculate average of three numbers
import java.util.Scanner;

class AverageOfThreeNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Calculate average
        double average = (number1 + number2 + number3) / 3;

        // Display the result
        System.out.println("The average of the three numbers is " + average);

        // Close the scanner
        input.close();
    }
}
