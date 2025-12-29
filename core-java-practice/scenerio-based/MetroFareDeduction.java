package scenerioBased;

//Create class MetroFareDeduction to calculate fare
import java.util.Scanner;
public class MetroFareDeduction {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
	    Scanner input = new Scanner(System.in);
	    
	    //variable to initialize the value
	    int balance=500;
	    int shortFare=20;
	    int longFare=15;
	    
	    //loop until balance is greater than 0
	    while(balance>0) {
	    	
	    	System.out.println("Enter distance to travel or type -1 to exit");
	    	
	    	//take variable to store distance and take input from user
	    	int distance=input.nextInt();
	    	
	    	//Check condition for exit
	    	if(distance==-1) {
	    		break;
	    	}
	    	
	    	int fare=(distance>20)?distance*longFare:distance*shortFare;
	    	if(fare>balance) {
	    		System.out.println("Low balance");
	    		break;
	    	}
	    	balance-=fare;
	    	System.out.println("Fare "+fare);
	    	
	    }
	    
	    //Display the remaining balance
	    System.out.println("Remaining balance :"+balance);
	    
	    //close input
	    input.close();

	}

}
