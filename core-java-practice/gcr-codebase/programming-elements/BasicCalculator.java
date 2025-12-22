// Create BasicCalculator class to perform arithmetic operations
import java.util.Scanner;

class BasicCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;

        // Display the result
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                        + number1 + " and " + number2 + " is " + additionResult + ", "
                        + subtractionResult + ", "+ multiplicationResult + ", and "+ divisionResult
        );

        // Close the scanner
        input.close();
    }
}
