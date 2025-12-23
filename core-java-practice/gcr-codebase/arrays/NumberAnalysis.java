package arrays;

//Create NumberAnalysis class to analyze number using array
import java.util.Scanner;

public class NumberAnalysis {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//take variable to store total numbers
		int totalNumbers=5;
		
		//Create an array to store numbers
		int[] numbers=new int[totalNumbers];
		
		//To take input from the user and add it in array
		for(int index=0;index<numbers.length;index++) {
			
			numbers[index]=input.nextInt();
		}
		
		//check the number is positive,negative,zero
		for(int index=0;index<numbers.length;index++) {
			
			int value=numbers[index];
			
			if(value>0) {
				
				System.out.println("Positive Number");
				if(value % 2==0) {
					System.out.println("Even Number");
				}else {
					System.out.println("Odd Number");
				}
			}else if(value<0){
				System.out.println("Negative Number");
			}else {
				System.out.println("Zero");
			}
		}
		
		//Take variable to store first and last number
		int firstNumber=numbers[0];
		int lastNumber=numbers[numbers.length-1];
		
		if(firstNumber==lastNumber) {
			
			System.out.println("First and Last number are equal");
		}else if(firstNumber>lastNumber) {
			
			System.out.println("First number is greater than last number");
		}else {
			
			System.out.println("First number is smaller than last number");
		}

		//Close Scanner
		input.close();
	}

}
