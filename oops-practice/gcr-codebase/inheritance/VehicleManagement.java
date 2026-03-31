package Inheritance;

//SuperClass
class Vehicle{
	
	//Attributes
	protected double maxSpeed;
	protected String model;
	
	//Constructor
	Vehicle(double maxSpeed,String model){
		this.maxSpeed=maxSpeed;
		this.model=model;
	}
	
	//Common method
	public void displayInfo() {
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Model: "+model);
	}
}

//Interface
interface Refuelable{
	
	//Method
	public void refuel();
}

//Subclass
class ElectricVehicle extends Vehicle{
	
	//Constructor
	ElectricVehicle(double maxSpeed,String model){
		super(maxSpeed,model);
	}
	
	
	public void charge() {
		System.out.println("Electric vehicle is charging.");
	}
}

//Subclass
class PetrolVehicle extends Vehicle implements Refuelable{
	
	//Constructor
	PetrolVehicle(double maxSpeed,String model){
		super(maxSpeed,model);
	}
	
	public void refuel() {
		System.out.println("Petrol vehicle is being refueled.");
	}
}



public class VehicleManagement {

	public static void main(String[] args) {
		
		ElectricVehicle electricCar = new ElectricVehicle(225,"Tesla Model 3");
        PetrolVehicle petrolCar = new PetrolVehicle(180,"Honda City");

        electricCar.displayInfo();
        electricCar.charge();

        System.out.println();

        petrolCar.displayInfo();
        petrolCar.refuel();
	}

}
