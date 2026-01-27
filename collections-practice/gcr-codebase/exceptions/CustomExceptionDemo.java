package exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String message){
		super(message);
	}
}

public class CustomExceptionDemo {
	
	public static void validate(int age)throws InvalidAgeException{
		
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}else {
			System.out.println("Access granted!");
		}
	}

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		try {
			int age=input.nextInt(); //store age
			
			validate(age);
			
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}finally {
			input.close();
		}

	}

}
