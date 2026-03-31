package arrays;

//Create MultiDimensionalArray class for creating 2d array and Copy the 2D Array into a single dimension array
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create variable to store row and columns and take the value from user
		int rows=input.nextInt();
		int columns=input.nextInt();
		
		//Create 2d array with the value of row and columns
		int[][] matrix=new int[rows][columns];
		
		//Create a variable to store index
		int index=0;
		
		//loop through the 2d array and store elements
		for(int row=0;row<rows;row++) {
			for(int column=0;column<columns;column++) {
				matrix[row][column]=input.nextInt();
			}
		}
		
		//Create 1d array of size rows*columns
		int [] array=new int[rows*columns];
		
		//loop through the 2d array and store the elements in 1d array
		for(int row=0;row<rows;row++) {
			for(int column=0;column<columns;column++) {
				array[index]=matrix[row][column];
				index++;
			}
		}
		
		//Display the elements
		for(int position=0;position<array.length;position++) {
			System.out.println("The elements are "+array[position]);
		}
		
		//Close the Scanner
		input.close();
	}

}
