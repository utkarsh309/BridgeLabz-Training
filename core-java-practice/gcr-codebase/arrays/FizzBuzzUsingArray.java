package arrays;

// Create FizzBuzzUsingArray class to check multiples of 3 and 5 and store values in array
import java.util.Scanner;

public class FizzBuzzUsingArray {

    public static void main(String[] args) {

        // Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        int number = input.nextInt();

        // Validate natural number
        if (number <= 0) {
            System.out.println("Invalid input");
            input.close();
            return;
        }

        // Create String array to store the results
        String[] results = new String[number + 1];

        // Store FizzBuzz values in the array
        for (int index = 1; index <= number; index++) {

            if (index % 3 == 0 && index % 5 == 0) {
                results[index] = "FizzBuzz";
            } else if (index % 3 == 0) {
                results[index] = "Fizz";
            } else if (index % 5 == 0) {
                results[index] = "Buzz";
            } else {
                results[index] = String.valueOf(index);
            }
        }

        // Display the results from the array
        for (int index = 1; index <= number; index++) {
            System.out.println("Position " + index + " = " + results[index]);
        }

        // Close scanner
        input.close();
    }
}
