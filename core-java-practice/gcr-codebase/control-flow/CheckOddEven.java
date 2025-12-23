package controlFlow;
//Create CheckOddEven class to print the odd and even number from 1 to n
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		//Create a object of Scanner to take input from keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable to store the number from the user
		int number=input.nextInt();
		
		//Check number is positive number or not
		if(number>0) {
			
			for(int counter=1;counter<=number;counter++) {
				//check number is even or odd
				if(counter%2==0) {
					System.out.println("The "+counter+" is even number");
				}else {
					System.out.println("The "+counter+" is odd number");
				}
			}
		}else {
			System.out.println("Enter Positive number Only");
		}
		
		//close input
		input.close();
	}

}
