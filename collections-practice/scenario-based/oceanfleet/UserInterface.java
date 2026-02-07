package scenario.oceanfleet;

import java.util.Scanner;
import java.util.List;
public class UserInterface {
	
	public static void displayVessel(Vessel vessel) {
		
		System.out.println(
				vessel.getVesselId() + "|"+
				vessel.getVesselName() + "|" +
				vessel.getVesselType() + "|" + 
				vessel.getAverageSpeed() + "knots");
	}

	public static void main(String []args) {
		
		// Create scanner object to take input form the user
		Scanner input = new Scanner(System.in);

		VesselUtil utility = new VesselUtil();

		System.out.println("Enter the number of vessels to be added");
		int count = input.nextInt();
		input.nextLine();// captures new line

		System.out.println("Enter vessel details");

		for (int i = 0; i < count; i++) {

			String vesselDetails = input.nextLine();

			String[] vessels = vesselDetails.split(":");

			String vesselId = vessels[0];
			String vesselName = vessels[1];
			double averageSpeed = Double.parseDouble(vessels[2]);
			String vesselType = vessels[3];

			Vessel vessel = new Vessel(vesselId, vesselName, averageSpeed, vesselType);
			utility.addVesselPerformance(vessel);

		}

		System.out.println("Enter the Vessel Id to check speed");
		String vesselId = input.nextLine();
		Vessel outputVessel = utility.getVesselById(vesselId);
		displayVessel(outputVessel);

		List<Vessel> highPerformanceVessels = utility.getHighPerformanceVessels();
		System.out.println("High performance vessels are");
		for (Vessel vessel : highPerformanceVessels) {
			displayVessel(vessel);
		}

		// Close scanner object
		input.close();
		
		
	}
}
