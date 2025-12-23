package controlFlow;

//Create CalculatorUsingSwitch class to perform arithmetic operations using switch

import java.util.Scanner;
public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create two double variable named first and second and string variable named op
		double first=input.nextDouble();
		double second=input.nextDouble();
		String op=input.next();
		
		//Perform Operation based on operator using switch 
		switch(op){
		
		case "+":
			System.out.println(first+second);
			break;
			
		case "-":
			System.out.println(first-second);
			break;
			
		case "*":
			System.out.println(first*second);
			break;
			
		case "/":
			System.out.println(first/second);
			break;
			
		default:
			System.out.println("Invalid Operation");
		
		}
		//close Scanner
		input.close();
		
		
	}

}
