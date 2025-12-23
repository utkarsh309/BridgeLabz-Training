package arrays;

//Create ArraySumCalculator class to store elements in array and calculate sum
import java.util.Scanner;

public class ArraySumCalculator {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Take variable to store maximum elements
		int maximumSize=10;
		
		//Take a variable to store sum of elements
		double sum=0.0;
		
		//Take a variable to store the index 
		int index=0;
		
		//Create array to store numbers
		double [] numbers=new double[maximumSize];
		
		//Use infinite loop to take user input
		while(true) {
			
			double value=input.nextDouble();
			
			//Break if user entered zero or negative number
			if(value<=0) {
				break;
			}
			
			//Break if the array is full
			if(index==maximumSize) {
				break;
			}
			
			//store value in array and increment index
			numbers[index]=value;
			index++;
			
			
		}
		
		//Calculate total using for loop
		for(int position=0;position<index;position++) {
			
			sum=sum+numbers[position];
		}
		
		//Display the total sum
		System.out.println("The total sum is "+sum);
		
		//Close the Scanner
		input.close();

	}

}
