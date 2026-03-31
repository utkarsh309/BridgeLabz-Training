package controlFlow;
//Create GreatestFactor class to calculate greatest factor of the given number

import java.util.Scanner;

public class GreatestFactor {

	public static void main(String[] args) {

		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Take a variable to store number
		int number=input.nextInt();
		
		//Check if the number is positive number
		if(number>0) {
			
			//create a variable to store greatest factor
			int greatestFactor=1;
			
			//Runs the loop in reverse order from number-1 to 1
			for(int i=number-1;i>=1;i--) {
				
				//check if the number is perfectly divisible by i
				if(number % i ==0) {
					greatestFactor=i;
					System.out.println(greatestFactor);
					break;
				}
			}
			
		}else {
			
			System.out.println("This is not a positive number");
		}
		
		//Close Scanner
		input.close();

	}

}
