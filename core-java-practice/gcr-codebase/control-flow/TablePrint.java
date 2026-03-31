package controlFlow;
//Create TablePrint class to print the table of number from 6 to 9
import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		
		//Create object of Scanner to take 
		Scanner input=new Scanner(System.in);
		
		//Create variable to store  and take input
		int number=input.nextInt();
		
		//Print multiplication table from 6 to 9
		for(int i=6;i<=9;i++) {
			System.out.println(number+" * "+i+" = "+(number*i));
		}
		
		//Close the Scanner
		input.close();

	}

}
