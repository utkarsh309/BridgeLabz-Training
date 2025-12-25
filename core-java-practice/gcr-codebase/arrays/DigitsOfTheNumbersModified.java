package arraysLevel2;

//Create DigitsOfTheNumbersModified Class to store the digits in an array and find the largest and second largest
import java.util.Scanner;

public class DigitsOfTheNumbersModified {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		// Take user input for the number
		int number = input.nextInt();
		
		//Create a variable to store the maxDigit
		int maxDigit=10;
		
		//Create an integer array to store the digits of the number
		int [] digits=new int[maxDigit];
		
		//Create a variable to store index 
		int index=0;
		
		while(number!=0) {
			
			if(index==maxDigit) {
				
				maxDigit=maxDigit+10;
				
				//Create temp Array of new size max Digit
				int[] tempArray=new int[maxDigit];
				
				//loop to copy the elements into the tempArray
				for(int position=0;position<index;position++) {
					
					tempArray[position]=digits[position];
				}
				
				
				//reference of tempArray in digits
				digits=tempArray;
				
				
			}
			//Assign the digits to the array
			int digit=number % 10;
			digits[index]=digit;
			number= number / 10;
			index++;
			
		}
		
		//Create a variable to store largest and second largest
		int largest=0;
		int secondLargest=0;
		
		//loop through the array to find largest and second largest
		for(int position=0;position<digits.length;position++) {
			
			if(digits[position]>largest) {
				
				secondLargest=largest;
				largest=digits[position];
				
			}else if(digits[position]>secondLargest && digits[position]!=largest) {
				
				secondLargest=digits[position];
				
			}
		}
		
		//display the result
		System.out.println("The largest number is "+largest+" and second largest number is "+secondLargest);

		
		//close scanner
		input.close();
	}

}
