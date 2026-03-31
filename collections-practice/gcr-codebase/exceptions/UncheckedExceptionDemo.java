package exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedExceptionDemo {

	public static void main(String[]args) {
		
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter first number: ");
			int num1=input.nextInt();
			
			System.out.println("Enter second number: ");
			int num2=input.nextInt();
			
			int result=num1/num2;
			System.out.println("Result: "+result);
			
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}catch(InputMismatchException e) {
			System.out.println("enter numeric value");
		}finally {
			input.close();
		}
	}
}
