package arraysLevel2;

//Create BmiCalculatorUsingArray class to find the bmi value and status
import java.util.*;

public class BmiCalculatorUsingArray {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Take input for number of persons
		System.out.println("Enter total number of students.");
		int totalPerson=input.nextInt();
		
		//Create arrays to store weight,height,bmi, and weight status of the person
		double [] weights=new double[totalPerson];
		double [] heights=new double[totalPerson];
		double [] bmis=new double[totalPerson];
		String [] status=new String[totalPerson];
		
		//Take input for the weight and height of the person
		for(int index=0;index<totalPerson;index++) {
			
			weights[index]=input.nextDouble();
			heights[index]=input.nextDouble();
		}
		
		for(int index=0;index<totalPerson;index++) {
			
			double bmi=weights[index]/(heights[index]*heights[index]);
			System.out.println(bmi);
			
			bmis[index]=bmi;
			if(bmi<=18.4) {
				status[index]="Underweight";
			}else if(bmi>=18.5&&bmi<=24.9) {
				status[index]="Normal";
			}else if(bmi>=25.0 && bmi<=39.9) {
				status[index]="Overweight";
			}else {
				status[index]="Obese";
			}
		}
		
		//Display the height,weight,bmi and status
		for(int index=0;index<totalPerson;index++) {
			
			System.out.println("Height is "+heights[index]+" Weight is "+weights[index]
					+" BMI is "+bmis[index]+" Status is "+status[index]);
		}
		
		//Close Scanner
		input.close();
	}

}
