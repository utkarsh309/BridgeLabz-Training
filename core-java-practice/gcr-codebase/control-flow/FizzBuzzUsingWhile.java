package controlFlow;
//Create FizzBuzzUsingWhile class to check the multiple of 3 or 5 using for loop

import java.util.Scanner;

public class FizzBuzzUsingWhile {

	public static void main(String[] args) {
		
		//Create object of Scanner class and take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store number and take input
				int number=input.nextInt();
				
				//check if the number is positive number
				if(number>0) {
					
					//Create a variable to store counter
					int counter=1;
					//loop from 1 to the given number
					
					while(counter<=number) {
						if(counter % 3 ==0 &&counter % 5==0) {
							System.out.println("FizzBuzz");
						}else if(counter % 3 ==0) {
							System.out.println("Fizz");
						}else if(counter % 5 ==0) {
							System.out.println("Buzz");
						}else {
							System.out.println(counter);
						}
						counter++;
					}
					
				}else {
					System.out.println("This is not a positive number");
				}
				//Close Scanner
				input.close();

	}

}
