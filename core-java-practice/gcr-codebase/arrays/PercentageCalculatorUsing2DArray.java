package arraysLevel2;

//Create PercentageCalculatorUsing2DArray class to calculate percentage and grade using 2d array
import java.util.Scanner;
public class PercentageCalculatorUsing2DArray {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		// Take user input for the number of students
		System.out.println("Enter total number of students ");
		int number = input.nextInt();
		
		//Create arrays to store marks, percentages, and grades of the students
			
		double [][] marks=new double[number][3];
		double [] percentages=new double[number];
		String [] grades=new String[number];
		
		//loop to take input in the marks
		for(int index=0;index<number;index++) {
			
			double mark;  
			
			System.out.println("Marks in physics");
			mark=input.nextDouble();
			if(mark<0) {
				System.out.println("Enter positive number");
				index--;
				continue;
			}else {
				marks[index][0]=mark;
			}
			
			
			System.out.println("Marks in Chemistry");
			mark=input.nextDouble();
			if(mark<0) {
				System.out.println("Enter positive number");
				index--;
				continue;
			}else {
				marks[index][1]=mark;
			
			}
			System.out.println("Marks in Maths");
			mark=input.nextDouble();
			if(mark<0) {
				System.out.println("Enter positive number");
				index--;
				continue;
			}else {
				marks[index][2]=mark;
			}
			
		}
		
		//Create variables to store totalSubjets,totalMarksObtained and maximum marks
		int totalSubjects=3;
		int totalMarks= 100;
		double totalMarksObtained;
		int maximumMarks=totalSubjects*totalMarks;
				
		//to calculate the percentage and grade
		for(int index=0;index<number;index++) {
					
			totalMarksObtained=marks[index][0]+marks[index][1]+marks[index][2];
			double percentage=totalMarksObtained/maximumMarks*100;
			percentages[index]=percentage;
					
			if(percentage>=80) {
				grades[index]="A";
			}else if(percentage>=70 && percentage<=79) {
				grades[index]="B";
			}else if(percentage>=60 && percentage<=69) {
				grades[index]="C";
			}else if(percentage>=50 && percentage<=59) {
				grades[index]="D";
			}else if(percentage>=40 && percentage<=49) {
				grades[index]="E";
			}else {
				grades[index]="R";
			}
					
		}
		
		//Display the marks percentages and grades of each student
		for(int index=0;index<number;index++) {
					
			System.out.println("Detail of Student "+index+1);
			System.out.println("Physics Marks "+marks[index][0]+"\nChemsitry Marks "+
					marks[index][1]+"\nMAths Marks "+marks[index][2]+
					"\nPercentage "+percentages[index]+"\nGrade "+grades[index]
					);
		}
				
		
		
		//Close the Scanner
		input.close();

	}

}
