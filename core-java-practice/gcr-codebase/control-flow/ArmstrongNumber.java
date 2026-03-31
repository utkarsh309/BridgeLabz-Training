package controlFlow;
//Create ArmstrongNumber class to check whether a number is armstrong number or not
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create variable to store the number
		int number=input.nextInt();
		
		//create variable to store sum variable and originalNumber
		int sum=0;
		int originalNumber=number;
		
		while(originalNumber!=0) {
			
			//Find the last digit
			int digit=originalNumber % 10;
			sum=sum+digit*digit*digit;
			
			//removes the last digit
			originalNumber=originalNumber / 10;
			
			
			
		}
		
		//check if the number and sum are the same
		if(number==sum) {
			System.out.println("Armstrong number");
			
		}else {
			System.out.println("Not an armstrong number");
		}

		//close scanner
		input.close();
	}

}
