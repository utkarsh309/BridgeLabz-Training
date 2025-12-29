package scenerioBased;

//Create BusRouteDistanceTracker to track distance
import java.util.Scanner;
public class BusRouteDistanceTracker {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
	    Scanner input = new Scanner(System.in);
	    
	    //Take variable to store distance and stops
	    double totalDistance=0;
	    int stopCount=0;
	    
	    //Display message
	    System.out.println("City Bus Tracker ");
	    
	    
	    while(true) {
	    	
	    	stopCount++;
	    	//each stop distance
	    	double nextStopDistance=3;
	    	
	    	totalDistance+=nextStopDistance;
	    	System.out.println("Stop "+stopCount+" is arrived ");
	    	System.out.println("total distance travelled "+totalDistance);
	    	
	    	System.out.println("Do you want to get off at this stop (yes/no)");
	    	
	    	String choice=input.next();
	    	
	    	//Check choice
	    	if(choice.equals("yes")) {
	    		break;//exit the loop
	    	}
	    	
	    }
	    //close Scanner
	    input.close();

	}

}
