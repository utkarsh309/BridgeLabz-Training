// Create DoubleOperation class to perform double operations
import java.util.Scanner;

class DoubleOperation {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Perform double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display the result
        System.out.println("The results of Double Operations are "+ result1 + ", "+ result2 + 
            ", "+ result3 + ", and "+ result4
        );

        // Close the scanner
        input.close();
    }
}
