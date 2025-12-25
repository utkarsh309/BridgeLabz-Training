package arrays;

//Create YoungestAndTallestFriend Class to find the youngest and tallest friend
import java.util.Scanner;

public class YoungestAndTallestFriend {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//create a variable constant to store number of friend
		int totalFriend=3;
		
		//Create array to store ages and height
		int []ages=new int[totalFriend];
		double []heights=new double[totalFriend];
		
		//Create array to store names
		String[]names= {"Amar","Akbar","Anthony"};
		
		//loop to store the values in ages and height
		for(int index=0;index<totalFriend;index++) {
			
			int age=input.nextInt();
			double height=input.nextDouble();
			
			if(age<=0 ||height<=0) {
				System.out.println("Invalid input, Reenter the value.");
				index--;
				continue;
			}
			ages[index]=age;
			heights[index]=height;
			
		}
		
		//Initialize with the first index
		int youngestIndex=0;
		int tallestIndex=0;
		
		//Check the youngest and tallest friend
		for(int index=1;index<totalFriend;index++) {
			
			if(ages[index]<youngestIndex) {
				youngestIndex=index;
			}
			
			if(heights[index]>tallestIndex) {
				tallestIndex=index;
			}
		}
		
		 // Display results
        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);

        // Close the scanner
        input.close();
		

	}

}
