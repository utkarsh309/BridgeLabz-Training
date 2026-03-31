//Create VolumeOfCylinder class to calculate volume of a cylinder
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        //Create Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Take user input for the radius and height of the cylinder
        double radius = input.nextDouble();
        double height = input.nextDouble();

        // Calculate volume of the cylinder
        double volume = Math.PI * radius * radius * height;

        // Display the result
        System.out.println(volume);

        //Close the scanner
        input.close();
    }
    
}
