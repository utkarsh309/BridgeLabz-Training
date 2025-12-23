// Create SimpleInterestCalculation class to calculate simple interest
import java.util.Scanner;

class SimpleInterestCalculation {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest);

        // Close the scanner
        input.close();
    }
}
