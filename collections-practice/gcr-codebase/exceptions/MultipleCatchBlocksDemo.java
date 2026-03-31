package exceptions;

import java.util.Scanner;

public class MultipleCatchBlocksDemo {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size=input.nextInt();
		
		System.out.println("Enter numbers for the array");
		int []array=new int[size];
		
//		int[]array=null;//for null pointer exception
		
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		
		System.out.println("Enter index to retrieve ");
		int index=input.nextInt();
		

		
		try {
			
			System.out.println(array[index-1]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index! ");
			
		}catch(NullPointerException e) {
			System.out.println("Array is not initialized!");
		}finally {
			input.close();
		}
		
	}

}
