package arraysLevel2;

//Create BmiCalculatorUsing2DArray class to calculate bmi value and store it in 2d array
import java.util.Scanner;

public class BmiCalculatorUsing2DArray {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
				
		//Take input for number of persons
		System.out.println("Enter total number of students.");
		int totalPerson=input.nextInt();
		
		//Create 2d array to store person details like weight,height and bmi
		double [][] personalDetails=new double[3][totalPerson];
		
		//create an array to store status
		String[] status = new String[totalPerson];
		
		System.out.println("First enter your weight and than height in meter");
		
		//loop to fill the details from the user
		for(int column=0;column<personalDetails[0].length;column++) {
			
			for(int row=0;row<personalDetails.length-1;row++ ) {
				
				personalDetails[row][column]=input.nextDouble();
				
				
			}
		}
		
		for(int index=0;index<personalDetails[0].length;index++) {
			
			personalDetails[2][index]=personalDetails[0][index]/(personalDetails[1][index]*personalDetails[1][index]);
		
			
			if(personalDetails[2][index]<=18.4) {
				status[index]="Underweight";
			}else if(personalDetails[2][index]>=18.5&&personalDetails[2][index]<=24.9) {
				status[index]="Normal";
			}else if(personalDetails[2][index]>=25.0 && personalDetails[2][index]<=39.9) {
				status[index]="Overweight";
			}else {
				status[index]="Obese";
			}
		}
		//display the result
		for(int index=0;index<totalPerson;index++) {
			
			System.out.println("Weight is "+personalDetails[0][index]+
					"Height is "+personalDetails[1][index]+
					"Bmi is "+personalDetails[2][index]+
					"Status is "+status[index]
					
					);
			
		}
		//Close Scanner
		input.close();

	}

}
