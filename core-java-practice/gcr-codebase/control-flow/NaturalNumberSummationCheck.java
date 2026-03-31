package controlFlow;
//Create NaturalNumberSummationCheck class to find sum of natural numbers

import java.util.Scanner;
public class NaturalNumberSummationCheck {

	public static void main(String[] args) {
	
		//Create object of Scanner to take input from keyboard
		Scanner input=new Scanner(System.in);
		
		//Create variable to store number and take input
		int number=input.nextInt();
		
		//Check number is natural number or not
		if(number>=1) {
			
			int sumOfNaturalNumberByFormula=number*(number+1)/2;
			
			int totalSum=0;
			
			for(int counter=1;counter<=number;counter++) {
				totalSum=totalSum+counter;
				
			}
			
			//check formulae and loop sum
			if(sumOfNaturalNumberByFormula==totalSum) {
				System.out.println("The sum of "+number+" natural number is "+totalSum+"and both results are correct");
			}else {
				System.out.println("The number "+ number+" is not a natural number");
			}
		}else {
			
			System.out.println("The number " + number + " is not a natural number");
		}
		
		//close the input 
		input.close();

	}

}
