package oopsPillars;


//Abstract Class
abstract class Vehicle{
	
	//Attributes
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	
	//Abstract method
	abstract double calculateRentalCost(int days);
	
	//Constructor
	Vehicle(String vehicleNumber,String type,double rentalRate) {
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
	}
	
	//getter methods
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	
	//Common method
	public void displayDetails() {
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Type: "+type);
	}
	
}

//Interface
interface Insurable{
	
	double calculateInsurance(int days);
	
	String getInsuranceDetails();
}

//Sub class
class Car extends Vehicle implements Insurable{
	
	private String policyNumber;
	
	Car(String vehicleNumber,String type,double rentalRate,String policyNumber){
		super(vehicleNumber,type,rentalRate);
		this.policyNumber=policyNumber;
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return days*getRentalRate();
	}
	
	@Override
	public double calculateInsurance(int days) {
		return 100*days;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Car Insurance";
	}
}

//Sub class
class Bike extends Vehicle implements Insurable{
	
	private String policyNumber;
	
	Bike(String vehicleNumber,String type,double rentalRate,String policyNumber){
		super(vehicleNumber,type,rentalRate);
		this.policyNumber=policyNumber;
	}
	@Override
	public double calculateRentalCost(int days) {
		return days*getRentalRate();
	}
	
	@Override
	public double calculateInsurance(int days) {
		return 50*days;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance";
	}
}

//Sub class
class Truck extends Vehicle implements Insurable{
	
	
	private String policyNumber;
	
	Truck(String vehicleNumber,String type,double rentalRate,String policyNumber){
		super(vehicleNumber,type,rentalRate);
		this.policyNumber=policyNumber;
	}
	@Override
	public double calculateRentalCost(int days) {
		return days*getRentalRate();
	}
	
	@Override
	public double calculateInsurance(int days) {
		return 200*days;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance";
	}
}





//Main Class
public class VehicleRentalSystem {

	public static void main(String[] args) {
		 
		Vehicle vehicle1=new Car("UP855698","4 Wheeler",3000,"12365478");
		Vehicle vehicle2=new Bike("UP859632","2 Wheeler",2000,"56984568");
		Vehicle vehicle3=new Truck("UP855236","8 Wheeler",5000,"12365896");
		
		Vehicle[] vehicles= {vehicle1,vehicle2,vehicle3};
		int days=5;
		
		for(Vehicle vehicle:vehicles) {
			
			vehicle.displayDetails();
			System.out.println("Rental Cost: "+vehicle.calculateRentalCost(days));
			System.out.println("Insurance Cost: "+((Insurable)vehicle).calculateInsurance(days));
			System.out.println(((Insurable)vehicle).getInsuranceDetails());
			System.out.println();
		}
		
		

	}

}
