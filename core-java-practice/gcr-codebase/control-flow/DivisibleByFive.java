// Create DivisibleByFive class to check divisibility by 5
import java.util.Scanner;

class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store number and take input
        int number = input.nextInt();

        // Check if number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        // Close the scanner
        input.close();
    }
}
