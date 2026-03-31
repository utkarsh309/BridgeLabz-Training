package controlFlow;

//Create AbundantNumber class to check a number is abundant number or not

import java.util.Scanner;
public class AbundantNumber {

	public static void main(String[] args) {

		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store number and take input from the user
		int number=input.nextInt();
		
		//Create a variable to store sum of divisor and put initial value as o
		int sumOfDivisor=0;
		
		//loop to find the divisor of number from 1 to number -1
		for(int i=1;i<number;i++) {
			
			//check the divisibility and add the divisor
			if(number % i ==0) {
				sumOfDivisor+=i;
			}
			
		}
		
		//Check if sum is greater than number
		if(sumOfDivisor>number) {
			
			//Display the result
			System.out.println("Abundant Number");
		}else {
			
			System.out.println("Not an Abundant Number");
		}
		//close Scanner
		input.close();

	}

}
