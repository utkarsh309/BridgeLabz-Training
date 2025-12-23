package arrays;

//Create StudentVotingEligibility class to check a student can vote or not

import java.util.Scanner;

public class StudentVotingEligibility {

	public static void main(String[] args) {

		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//create a variable to store number of students
		int totalStudent=10;
		
		//Create an integer array to store ages of students
		int[] studentAges=new int[totalStudent];
		
		//Take user input for age of all students
		for(int index=0;index<studentAges.length;index++) {
			
			studentAges[index]=input.nextInt();
		}
		
		//to iterate through out the array
		for(int index=0;index<studentAges.length;index++) {
			
			int age=studentAges[index];
			
			if(age<0) {
				System.out.println("Invalid Age");
			}else if(age>=18) {
				System.out.println("The Student with the age "+age+" can vote");
			}else {
				System.out.println("The Student with the age "+age+" can not vote");
			}
		}
		//close Scanner
		input.close();

	}

}
