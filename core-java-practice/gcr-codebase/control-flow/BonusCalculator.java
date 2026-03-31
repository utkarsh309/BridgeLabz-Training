package controlFlow;
//Create BonusCalculator class to calculate the bonus of employee

import java.util.Scanner; 

public class BonusCalculator {

	public static void main(String[] args) {
		//Create Scanner object to take input from the keyboard
		Scanner input =new Scanner(System.in);
		
		//Create Variable to store salary and year of service
		int salary=input.nextInt();
		int yearOfService=input.nextInt();
		
		int bonusPercentage=5;
		
		//Check the year of service
		if(yearOfService>5) {
			int bonusAmount=salary*bonusPercentage/100;
			
			//display the result
			System.out.println("The Bonus amount is "+bonusAmount);
		}else {
			System.out.println("Service Year is less than 5 years");
		}
		
		//close the input
		input.close();
	}

}
