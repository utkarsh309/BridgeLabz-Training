package controlFlow;
//Create FizzBuzz class to check the multiple of 3 and 5

import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		
		//Create Scanner class object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store number and take input
		int number=input.nextInt();
		
		//check if the number is positive number
		if(number>0) {
			
			//loop from 1 to the given number
			for(int i=1;i<=number;i++) {
				if(i % 3 ==0 &&i % 5==0) {
					System.out.println("FizzBuzz");
				}else if(i % 3 ==0) {
					System.out.println("Fizz");
				}else if(i % 5 ==0) {
					System.out.println("Buzz");
				}else {
					System.out.println(i);
				}
			}
			
		}else {
			System.out.println("This is not a positive number");
		}
		//Close Scanner
		input.close();
	}

}
