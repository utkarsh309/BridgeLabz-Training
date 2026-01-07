package cabBookingApp;
import java.util.List;
import java.util.ArrayList;

//Interface
interface FareCalculator{
	
	double calculateFare(double distance);
}

//Sub class 
class NormalFareCalculator implements FareCalculator{
	
	private static final double FARE_PER_KM=15;
	
	@Override
	public double calculateFare(double distance) {	//polymorphism
		return distance*FARE_PER_KM;
	}
	
}

//Sub class
class PeakFareCalculator implements FareCalculator{
	
	private static final double FARE_PER_KM=20;
	
	@Override
	public double calculateFare(double distance) {	//polymorphism
		return distance*FARE_PER_KM;
	}
	
}

//User Class
class User{
	
	//Attributes
	private int userId;
	private String name;
	
	//Constructor
	User(int userId,String name){
		this.userId=userId;
		this.name=name;
	}
	
	public String getUserName() {
		return name;
	}
}

//Driver Class
class Driver{
	
	//Attributes
	private int driverId;
	private String name;
	private boolean isAvailable=true;
	
	//Constructor
	Driver(int driverId,String name){
		this.driverId=driverId;
		this.name=name;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void assignRide() {
		isAvailable=false;
	}
	
	public void completeRide() {
		isAvailable=true;
	}
	
	public String getDriverName() {
		return name;
	}
}

//Ride Class
class Ride{
	
	//Attributes
	private User user;
	private Driver driver;
	private double distance;
	private double fare;
	
	//Constructor
	Ride(User user,Driver driver,double distance,FareCalculator fareCalculator){
		this.user=user;
		this.driver=driver;
		this.distance=distance;
		this.fare=fareCalculator.calculateFare(distance);
	}
	
	public void completeRide() {
		driver.completeRide();
	}
	
	public void displayRideDetails() {
		System.out.println("User: "+user.getUserName());
		System.out.println("Driver: "+driver.getDriverName());
		System.out.println("Distance: "+distance);
		System.out.println("Fare: "+fare);
	}
}

//Custom Exception
class  NoDriverAvailableException extends Exception{
	
	NoDriverAvailableException(String message){
		super(message);
	}
}

//RideService class to manage ride
class RideService{
	
	List<Driver> drivers=new ArrayList<>();
	List<Ride>rideDetails=new ArrayList<>();
	
	RideService(List<Driver> drivers){
		this.drivers=drivers;
	}
	
	public Ride bookRide(User user,double distance,FareCalculator fareCalculator)
			throws NoDriverAvailableException{
		
		for(Driver driverr:drivers) {
			
			if(driverr.isAvailable()) {
				driverr.assignRide();
				Ride ride=new Ride(user,driverr,distance,fareCalculator);
				rideDetails.add(ride);
				return  ride;
			}
		}
		throw new NoDriverAvailableException("No Driver Available");
	}
	
	public void showRideDetails() {
		for(Ride ride:rideDetails) {
			ride.displayRideDetails();
		}
	}
	
	public void deleteRideDetails() {
		rideDetails.clear();
	}
	
}



//Main Class
public class CabBookingApp {

	public static void main(String[] args) {
		
		User user1=new User(101,"Utkarsh");
		
		Driver driver1=new Driver(102,"Amit");
		Driver driver2=new Driver(103,"Vansh");
		
		FareCalculator fare1=new NormalFareCalculator();
		FareCalculator fare2=new PeakFareCalculator();
		
		List<Driver> drivers=new ArrayList<>();
		drivers.add(driver1);
		drivers.add(driver2);
		
		RideService rideService=new RideService(drivers);
		
		try {
			
			Ride ride1=rideService.bookRide(user1,10, fare1);
			ride1.displayRideDetails();
			
			Ride ride2=rideService.bookRide(user1, 20, fare2);
			ride2.displayRideDetails();
			
		}catch(NoDriverAvailableException e) {
			System.out.println(e.getMessage());
		}
		
		//Show all ride details
		System.out.println("Ride History: ");
		rideService.showRideDetails();
		
		//Delete ride details
		rideService.deleteRideDetails();

	}

}
