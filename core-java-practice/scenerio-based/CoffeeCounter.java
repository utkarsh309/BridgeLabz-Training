package scenerioBased;

//Create CoffeeCounter class to manage the operations of coffee shop
import java.util.Scanner;

public class CoffeeCounter {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the keyboard
		Scanner input=new Scanner(System.in);
		
		//Create variable to store gst percentage
		double gstPercentage=5.0;
		
		//continue serving customer
		while(true) {
			
			//Create variable to store coffee type and quantity
			String coffeeType=input.next();
			
			if(coffeeType.equalsIgnoreCase("exit")) {
				break;
			}
			
			//Create a variable to store quantity 
			int quantity=input.nextInt();
			
			//Create a variable to store the price of coffee
			double pricePerCup=0.0;
			
			switch(coffeeType.toLowerCase()) {
			
			case "cappuccino":
				pricePerCup=170;
				break;
				
			case "latte":
				pricePerCup=160;
				break;
				
			case "espresso":
				pricePerCup=150;
				break;
				
			default:
				System.out.println("Invalid type");
			
			}
			
			double coffeePrice=quantity * pricePerCup;
			
			double gstAmount=coffeePrice*gstPercentage/100;
			
			double totalAmount=coffeePrice+gstAmount;
			
			//Display the result
			System.out.println("Total Coffee Price "+coffeePrice+" GST Amount "+gstAmount+" Total Bill "+totalAmount);
			
			
			
		}
		
		//Close Scanner
		input.close();

	}

}
