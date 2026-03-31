package string.level1;
//Create NumberFormatExceptionExample class to demonstrate NumberFormatException
import java.util.Scanner;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		// Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take user input
        String text = input.next();

        // Call method that handles IllegalArgumentException
        handleNumberFormatException(text);

        // Close scanner
        input.close();

	}
	
	//Method to generate numberFormat Exception
	public static void generateNumberFormatException( String text) {
		
		//Trying to extract number from the text
		int number=Integer.parseInt(text);
		
		System.out.println(number);
		
	}
	
	//Method to handle numberFormatException
	public static void handleNumberFormatException( String text) {
		
		try {
			generateNumberFormatException(text);
		}catch(NumberFormatException exception) {
			System.out.println("Number Format Exception handled successfully");
		}
	}
	

}
