package scenario.aerovigil;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter flight details in the format" );
		System.out.println("<FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuelLevel>\n");
		
		//Flight details in a string
		String inputFromUser=input.nextLine();
		
		//split the details
		String [] details=inputFromUser.split(":");
		
		String flightNumber=details[0];
		String flightName=details[1].toLowerCase();
		int passengerCount=Integer.parseInt(details[2]);
		int currentFuelLevel=Integer.parseInt(details[3]);
		
		
		try {
			
			FlightUtil.validateFlightNumber(flightNumber);
			FlightUtil.validateFlightName(flightName);
			FlightUtil.validatePassengerCount(passengerCount, flightName);
			double fuel=FlightUtil.calculateFuelToFillTank(flightName, currentFuelLevel);
			System.out.println("Fuel required to fill the tank " +fuel +" liters");
			
		}catch(InvalidFlightException e) {
			System.out.println(e.getMessage());
		}
		
		//close scanner
		input.close();
	}

}
