// Create RectanglePerimeter class to calculate the perimeter of a rectangle
import java.util.Scanner;

class RectanglePerimeter {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        double length = input.nextDouble();
        double width = input.nextDouble();

        // Calculate perimeter of the rectangle
        double perimeter = 2 * (length + width);

        // Display the result
        System.out.println("The Perimeter of the Rectangle is " + perimeter);

        // Close the scanner
        input.close();
    }
}
