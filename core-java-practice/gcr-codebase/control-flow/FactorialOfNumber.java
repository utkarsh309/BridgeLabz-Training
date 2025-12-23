package controlFlow;
//Create FactorialOfNumber class to calculate the factorial
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//Create an object of Scanner to take the input from the keyboard
				Scanner input= new Scanner(System.in);
				
				//Create a variable to store the number from the user
				int number=input.nextInt();
				
				//Check number is positive number or not
				if(number>0) {
					
					//Create variable to store counter and factorial
					int counter=1;
					int factorial=1;
					
					while(counter<=number) {
						factorial=factorial*counter;
						counter++;
					}
					//Display the result
					System.out.println("The factorial of "+number+" is "+factorial);
				}else {
					System.out.println("This is not a positive integer");
				}
				
				input.close();
	}

}
