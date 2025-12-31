package oopsPractice;

//Class Definition
public class MovieTicket {

	//Attributes
	private String movieName;
	private String seatNumber;
	private double price;
	static int MaxSeat=3;
	
	//Constructor
	public MovieTicket(String movieName,String seatNumber,double price) {
		
		this.movieName=movieName;
		this.seatNumber=seatNumber;
		this.price=price;
	}
	//method to book ticket
	public void bookTicket() {
		System.out.println("Ticket have not booked yet..");
		if(MaxSeat>0) {
			System.out.println("Ticket booked for movie: "+this.movieName);
			System.out.println("Price: $ "+price);
			MaxSeat--;
		}else {
			System.out.println("House full!!!sorry....Ticket already booked");
		}
		
		
	}
	
	//Method to display ticket details
	public void displayDetails() {
		System.out.println("Ticket booked for movie: "+this.movieName);
		System.out.println("Seat Number: "+this.seatNumber);
		System.out.println("Price: $ "+price);
		
	}
	
	public static void main(String[] args) {
		
		MovieTicket ticket1=new MovieTicket("Avatar 3","A10",120);
		
		ticket1.bookTicket();
		ticket1.displayDetails();

	}

}
