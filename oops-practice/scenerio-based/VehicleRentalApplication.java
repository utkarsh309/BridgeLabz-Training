package oopsScenario;

import java.util.ArrayList;
//Interface
interface IRentable{
	double calculateRent(int days);
}


//Abstract Class
abstract class Vehicle implements IRentable{
	
	//Attributes
	protected int vehicleId;
	protected String brand;
	protected double pricePerDay;
	
	//Constructor
	Vehicle(int vehicleId,String brand,double pricePerDay){
		this.vehicleId=vehicleId;
		this.brand=brand;
		this.pricePerDay=pricePerDay;
	}
	
	public int getVehicleId() {
		return vehicleId;
	}
	
	//Abstract method
	public abstract void displayInfo();
}

//Bike Class
class Bike extends Vehicle{
	
	Bike(int vehicleId,String brand,double pricePerDay){
		super(vehicleId,brand,pricePerDay);
	}
	
	public void displayInfo() {
		System.out.println("Bike Id: "+this.vehicleId);
		System.out.println("Brand: "+this.brand);
		System.out.println("Price Per day: "+this.pricePerDay);
	}
	
	@Override
	public double calculateRent(int days) {
		return days*pricePerDay;
	}
	
	
}

//Car Class
class Car extends Vehicle{
	
	//Constructor
	Car(int vehicleId,String brand,double pricePerDay){
		super(vehicleId,brand,pricePerDay);
	}
	
	public void displayInfo() {
		System.out.println("Bike Id: "+this.vehicleId);
		System.out.println("Brand: "+this.brand);
		System.out.println("Price Per day: "+this.pricePerDay);
	}
	
	@Override
	public double calculateRent(int days) {
		return (days*pricePerDay)+200;
	}
	
	
}

//Truck class
class Truck extends Vehicle{
	
	//Constructor
	Truck(int vehicleId,String brand,double pricePerDay){
		super(vehicleId,brand,pricePerDay);
	}
		
	public void displayInfo() {
		System.out.println("Bike Id: "+this.vehicleId);
		System.out.println("Brand: "+this.brand);
		System.out.println("Price Per day: "+this.pricePerDay);
	}
		
	@Override
	public double calculateRent(int days) {
		return (days*pricePerDay)+500;
	}
}

//Customer Class
class Customer{
	
	//Attributes
	protected int customerId;
	protected String name;
	
	Customer(int customerId,String name){
		this.customerId=customerId;
		this.name=name;
	}
	
	public void customerDetails() {
		System.out.println("Customer Id: "+customerId);
		System.out.println("Name: "+name);
	}
}

//Service class for CRUD operations
class VehicleService{
	
	private ArrayList<Vehicle> vehicles=new ArrayList<>();
	
	//Create
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	//Read
	public void displayVehicle(Vehicle vehicle) {
		
		vehicle.displayInfo();
	}
	
	public void displayAllVehicle() {
		if(vehicles.isEmpty()) {
			System.out.println("No Vehicle Available");
			return;
		}
		
		for(Vehicle vehicle:vehicles) {
			
			displayVehicle(vehicle);
		}
	}
	
	//Update
	public void updateVehiclePrice(int id,double newPrice) {
		
		for(Vehicle vehicle:vehicles) {
			if(vehicle.getVehicleId()==id) {
				vehicle.pricePerDay=newPrice;
				return;
			}
		}
		System.out.println("No Vehicle Found");
	}
	
	//Delete
	public void deleteVehicle(int id) {
		for(Vehicle vehicle:vehicles) {
			if(vehicle.getVehicleId()==id) {
				vehicles.remove(vehicle);
				System.out.println("Vehicle removed successfully.");
                return;
			}
		}
		System.out.println("No Vehicle Found");

	}
}

//Main Class
public class VehicleRentalApplication {

	public static void main(String[] args) {
		
		Vehicle bike=new Bike(101,"Hero Honda",400);
		Vehicle car=new Car(102,"Honda City",1000);
		Vehicle truck=new Truck(103,"Tata",1500);
		
		Customer customer1=new Customer(201,"Utkarsh");
		
		VehicleService service1=new VehicleService();
		service1.addVehicle(bike);
		service1.addVehicle(car);
		service1.addVehicle(truck);
		
		service1.displayAllVehicle();
		
		service1.updateVehiclePrice(101, 500);
		
		service1.deleteVehicle(103);
		service1.displayAllVehicle();
		customer1.customerDetails();

	}

}
