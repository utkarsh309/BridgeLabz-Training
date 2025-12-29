package scenerioBased;
//Create ElectionBoothManager class to manage the system
import java.util.Scanner;
public class ElectionBoothManager {

	public static void main(String[] args) {

		//Create Scanner object to take input from the keyboard
	    Scanner input = new Scanner(System.in);
	    
	    // Variables to store votes of candidates
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
	    
	    //loop for multiple voters
	    while(true) {
	    	
	    	System.out.println("Enter your age or type 0 for exit");
	    	//Create a variable and take input for age
		    int age=input.nextInt();
		    
		    if(age==0) {
		    	break;//exit the loop
		    }
		    //Check eligibility
		    if(age<18) {
		    	System.out.println("You cannot vote ");
		    	continue;
		    }
		    
		    System.out.println("Select candidate : 1-Utkarsh,2-Aditya,3-Rahul");
		    int vote=input.nextInt();
		    
		    if(vote==1) {
		    	candidate1Votes++;
		    }else if(vote==2) {
		    	candidate2Votes++;
		    }else if(vote==3) {
		    	candidate3Votes++;
		    }else {
		    	System.out.println("Invalid input");
		    }
		    
		      
	    }
	    
	    //Display the result
	    System.out.println("Candidate 1 vote"+candidate1Votes);
	    System.out.println("Candidate 2 vote"+candidate2Votes);
	    System.out.println("Candidate 3 vote"+candidate3Votes);
	    
	    //Close Scanner
	    input.close();
	     

	}

}
