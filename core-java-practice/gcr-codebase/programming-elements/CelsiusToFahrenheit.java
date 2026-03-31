//Create CelsiusToFahrenheit class to calculate Fahrenheit 
import java.util.Scanner;
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
   
    //Create Scanner object to take input from the keyboard
    Scanner input=new Scanner(System.in);

    // Take user input for the celsius temperature
    int celsius = input.nextInt();

    // Calculate Fahrenheit
    int fahrenheit = (celsius * 9/5) + 32;

    // Display the result
    System.out.println(fahrenheit);
    
    //Close the scanner
    input.close();

    }
    
}
