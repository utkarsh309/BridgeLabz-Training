package scenerioBased;
//Create FestivalLuckyDraw class to check lucky draw
import java.util.Scanner;
public class FestivalLuckyDraw {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
	    Scanner input = new Scanner(System.in);
	    
	    //Display message
	    System.out.println("Welcome to Festival lucky draw ");
	    
	    //Loop for multiple visitors
	    while(true) {
	    	
	    	System.out.println("Enter a number between 1 to 100 or '0' to exit ");
	    	int number=input.nextInt();
	    	
	    	if(number==0) {
	    		break;
	    	}
	    	if(number<0) {
	    		System.out.println("Invalid number ");
	    		continue;
	    	}
	    	if(number%3==0 && number%5==0) {
	    		System.out.println("Congratulation! you won");
	    	}else {
	    		System.out.println("Better luck next time");
	    	}
	    	
	    }
	    //close scanner
	    input.close();

	}

}
