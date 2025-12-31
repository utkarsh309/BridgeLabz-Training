package constructor;

//Class Definition
public class HotelBooking {

	//Attributes
	private String guestName;
	private String roomType;
	private int nights;
	
	//default constructor
	HotelBooking(){
		guestName="Utkarsh";
		roomType="Double";
		nights=2;
	}
	
	//Parameterized constructor
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	
	//Copy constructor
	HotelBooking(HotelBooking otherBooking){
		this.guestName=otherBooking.guestName;
		this.roomType=otherBooking.roomType;
		this.nights=otherBooking.nights;
	}
	
	//display booking details
	void display() {
		System.out.println("Guest Name: "+guestName);
		System.out.println("Room Type: "+roomType);
		System.out.println("nights: "+nights);
		
	}
	
	
	public static void main(String[] args) {
		
		HotelBooking booking1=new HotelBooking();
		HotelBooking booking2=new HotelBooking("Aditya","single",1);
		HotelBooking booking3=new HotelBooking(booking2);
		
		//Display default constructor
		booking1.display();
		
		//Display parameterized constructor
		booking2.display();
		
		//Display Copy constructor
		booking3.display();

	}

}
