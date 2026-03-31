package keywords;

public class Vehicle {

		//Static variable
		private static double registrationFee=150.0;
	
		
		//Instance variable
		private String ownerName;
		private String vehicleType;
		
		
		
		//final variable
		private final String registrationNumber;
		
		public Vehicle(String ownerName,String vehicleType,String registrationNumber) {
			this.ownerName=ownerName;
			this.vehicleType=vehicleType;
			this.registrationNumber=registrationNumber;
		}
		
		//Static method to display totalEmployee
		public static void updateRegistrationFee() {
			System.out.println("Registration Fee: "+registrationFee);
		}
		
		
		
		public void displayVehicleDetails() {
			if(this instanceof Vehicle) {
			System.out.println("Owner Name: "+ownerName);
			System.out.println("Vehicle Type: "+vehicleType);
			System.out.println("Registration Number: "+registrationNumber);
			System.out.println("Registration Fee: "+registrationFee);
			}else {
				System.out.println("Invalid Object");
			}
		}
		
		
		public static void main(String[] args) {
			
			Vehicle vehicle1=new Vehicle("Honest raj","Sedan","ABC123");
			Vehicle vehicle2=new Vehicle("Price danish","SUV","XYZ789");
			
		
			vehicle1.displayVehicleDetails();
			System.out.println();
			vehicle2.displayVehicleDetails();
			
		
	}
}
