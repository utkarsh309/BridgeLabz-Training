// Create SquarePerimeter class to calculate perimeter of square
import java.util.Scanner;

class SquarePerimeter {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variable to store perimeter and take input
        double perimeter = input.nextDouble();

        // Calculate perimeter of square
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter
        );

        // Close the scanner
        input.close();
    }
}
