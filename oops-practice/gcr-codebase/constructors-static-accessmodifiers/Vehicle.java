package constructor;

//Class Definition
public class Vehicle {
	//instance variable
	private String ownerName;
	private String vehicleType;
	
	//class variable
	private static double registrationFee=5000;
	
	//parametrized constructor
	public Vehicle(String ownerName,String vehicleType) {
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		
	}
	
	//Instance method
	public void displayVehicleDetails() {
		System.out.println("Registration Fee: "+registrationFee);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Vehicle Type: "+vehicleType);
		
	}
	
	//Class method
	public static void updateRegistrationFee(double newRegistration) {
		registrationFee=newRegistration;
	}
	
	
	public static void main(String[] args) {
		
		Vehicle vehicle1=new Vehicle("Utkarsh","Two-Wheeler");
		
		Vehicle vehicle2=new Vehicle("Shishir","Four-Wheeler");
		
		vehicle1.displayVehicleDetails();
		vehicle2.displayVehicleDetails();
		
		System.out.println();
		
		//Updating registration number
		Vehicle.updateRegistrationFee(6000);
		
		vehicle1.displayVehicleDetails();
		vehicle2.displayVehicleDetails();

	}

}
