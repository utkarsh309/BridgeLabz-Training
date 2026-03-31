package oopsScenario;

import java.util.Scanner;
import java.util.ArrayList;

//Flight class
class Flight{
	
	private String flightId;
	private String source;
	private String destination;
	
	//Constructor
	Flight(String flightId,String source,String destination){
		this.flightId=flightId;
		this.source=source;
		this.destination=destination;
	}
	
	public String getFlightId() {
		return flightId;
	}
	
	public String getSource() {
		return source;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void displayFlight() {
		System.out.println("Flight Id "+flightId+" From "+source+" To "+destination);
	}
	
}

//Booking class
class Booking{
	
	private String username;
	private Flight flight;
	
	Booking(String username,Flight flight){
		this.username=username;
		this.flight=flight;
	}
	
	public void displayBooking() {
		System.out.println("User Name: "+username+ " Flight Id "+flight.getFlightId()+" From "+flight.getSource()+" to "+flight.getDestination());
	}
}

//Flight Service Class
class FlightService{
	
	private static Flight[] flights= {
			new Flight("F101","Delhi","Mumbai"),
			new Flight("F102","Mumbai","Delhi"),
			new Flight("F103","Delhi","Patna"),
			new Flight("F104","Delhi","Pune")
	};
	
	private static ArrayList<Booking> bookings=new ArrayList<>();
	
	public void searchFlight(Scanner scanner) {
		
		System.out.println("Enter the Source: ");
		String source=scanner.nextLine();
		
		System.out.println("Enter the Destination");
		String destination=scanner.nextLine();
		
		for(Flight flight:flights) {
			
			if(flight.getSource().equalsIgnoreCase(source)&&flight.getDestination().equalsIgnoreCase(destination)) {
				
				flight.displayFlight();
				return;
			}
		}
		System.out.println("No flight Found ");
	}
	
	public void bookFlight(Scanner scanner) {
		
		System.out.println("Enter User Name: ");
		String username=scanner.nextLine();
		
		System.out.println("Enter Flight Id: ");
		String flightId=scanner.nextLine();
		
		for(Flight flight:flights) {
			
			if(flight.getFlightId().equalsIgnoreCase(flightId)) {
				bookings.add(new Booking(username,flight) );
				System.out.println("Successfully Booked");
				return;
			}
		}
		System.out.println("No flight found");
	}
	
	// Method to display bookings
    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        System.out.println(" Booking Details ");
        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }
	
	
}

//Main Class
public class FlightBookingSystem {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		FlightService service=new FlightService();
		
		while(true) {
			
			System.out.println(" Flight Booking System ");
			System.out.println("1.Search Flight");
			System.out.println("2.Book Flight");
			System.out.println("3.View Bookings");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			
			int choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
				
			case 1:
				service.searchFlight(scanner);
				break;
				
			case 2:
				service.bookFlight(scanner);
				break;
				
			case 3:
				service.displayBookings();
				break;
				
			case 4:
				return;
				
			default:
				System.out.println("Invalid Choice");
				
			}
			
			
		}

	}

}
