package scenerioBased2;

//Create ScoreAnalyzer to find the average, highest and lowest scores
import java.util.Scanner;
public class ScoreAnalyzer {
	
	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create a variable and take input from the user
		int number=input.nextInt();
		
		//Create array to store scores
		int [] scores=new int [number];
		
		//Loop to take input from the user
		for(int index=0;index<scores.length;index++) {
			
			int num=input.nextInt();
			if(num<0) {
				System.out.println("Enter Positive Number: ");
				index--;
				continue;
			}
			scores[index]=num;
		}
		
		//Variable to store total scores and highest and lowest score
		int totalScore=0;
		int highestScore=Integer.MIN_VALUE;
		int lowestScore=Integer.MAX_VALUE;
		
		//loop through the array
		for(int index=0;index<scores.length;index++) {
			
			totalScore+=scores[index];
			if(scores[index]<lowestScore) {
				lowestScore=scores[index];
			}
			if(scores[index]>highestScore) {
				highestScore=scores[index];
			}
			
		}
		
		int average=totalScore/scores.length;
		
		//Display the result
		System.out.println("Average Score: "+average);
		System.out.println("Highest Score: "+highestScore);
		System.out.println("Lowest Score: "+lowestScore);
		
		//Loop to check the score above average
		for(int index=0;index<scores.length;index++) {
			if(scores[index]>average) {
				System.out.println("Scores above the average: "+average);
			}
		}
		
		//close Scanner
		input.close();
		

	}

}
