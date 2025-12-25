package arraysLevel2;

//Create DigitFrequency class to calculate frequency of each digits
import java.util.Scanner;
public class DigitFrequency {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		// Take user input for the number
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// Validate input
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            input.close();
            return;
        }
		
		//Take a variable to store count and temp number
		int tempNumber=number;
		int count=0;
		
		//loop to find the number of digits
		while(tempNumber!=0) {
			
			count++;
			tempNumber=tempNumber / 10;	
		}
		
		//Create an array to store digits in the array
		int [] digits=new int[count];
		
		//Create a variable to store index
		int index=0;
		
		tempNumber=number;
		
		//store digits to array
		while(tempNumber!=0) {
			
			int digit= tempNumber % 10;
			tempNumber=tempNumber / 10;
			digits[index++]=digit;
			
		}
		
		//Create a frequency array to store frequency of each digit
		int[] frequency=new int[10];
		
		//loop to find the frequency of digits
		for(int position=0;position<digits.length;position++) {
			
			int digit=digits[position];
			
			frequency[digit]++;
			
		}
		
		//Display the result
		for(int position=0;position<frequency.length;position++) {
			
			System.out.println(" Digit "+position + " has "+frequency[position]+" frequency");
		}
		
		//close Scanner
		input.close();
	}

}
