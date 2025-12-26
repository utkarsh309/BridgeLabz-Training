package string.level1;
//Create StringIndexOutOfBoundsException class to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store string and take user input
		String text=input.next();
		
		handleStringIndexOutOfBoundsException(text);
		
		//close the scanner
		input.close();
		

	}
	//handles the exception
	public static void handleStringIndexOutOfBoundsException(String text) {
		
		try {
		//Generates stringIndex out of bounds exception
		for(int index=0;index<=text.length();index++) {
			char character=text.charAt(index);
		}
		
		}catch(StringIndexOutOfBoundsException exception) {
			System.out.println("String index out of bounds exception handled successfully");
		}
	}

}
