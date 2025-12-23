// Create KilometerToMiles class to convert kilometers into miles
import java.util.Scanner;

class KilometerToMiles {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store kilometers and take input
        double kilometers = input.nextDouble();

        // Convert kilometers to miles : 1km=0.621371miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println("The distance in miles is " + miles + " for the given " + kilometers + " kilometers");

        // Close the scanner
        input.close();
    }
}
