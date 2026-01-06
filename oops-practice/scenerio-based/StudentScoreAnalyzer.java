package scenerioBased2;
import java.util.Scanner;

//Custom Exception Class
class InvalidScoreException extends Exception{
	
	public InvalidScoreException(String message) {
		super(message);
	}
}

//Create StudentScoreAnalyzer class for finding average, minimum and maximum score.
public class StudentScoreAnalyzer {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Take a variable to store number of students
		System.out.println("Enter number of Students: ");
		int number=input.nextInt();
		
		//create an array to store scores
		int[]scores=new int[number];
		
		//Take input for scores
		for(int index=0;index<scores.length;index++) {
			scores[index]=input.nextInt();
		}
		
		try {
			int average=calculateAverage(scores);
			int maximum=findMax(scores);
			int minimum=findMin(scores);
			
			System.out.println("Average : "+average);
			System.out.println("Maximum : "+maximum);
			System.out.println("Minimum : "+minimum);
		
		}catch(InvalidScoreException e) {
			System.out.println("Error "+e.getMessage());
		}
	}
	
	//Method to calculate average
	public static int calculateAverage(int[]scores) throws InvalidScoreException {
		
		int totalAmount=0;
		int average=0;
		
		for(int index=0;index<scores.length;index++) {
			
			if(scores[index]<0||scores[index]>100) {
				throw new InvalidScoreException("Invalid Score ");
			}
			totalAmount+=scores[index];
			
		}
		average=totalAmount/scores.length;
		
		return average;
	}
	
	//Method to calculate average
	public static int findMax(int[]scores) throws InvalidScoreException{
		
		int max=Integer.MIN_VALUE;
		for(int value:scores) {
			if(value>max) {
				max=value;
			}
		}
		return max;
	}
	
	//Method to calculate average
	public static int findMin(int[]scores) throws InvalidScoreException{
			
		int min=Integer.MAX_VALUE;
		for(int value:scores) {
			if(value<min) {
				min=value;
			}
		}
		return min;
	}

}
