package scenario.factoryrobothazard;

import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		
		//Create Scanner object to take input from the user
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Arm Precision (0.0 - 1.0):");
		double armPrecision=input.nextDouble();
		
		System.out.println("Enter Worker Density (1 - 20):");
		int workerDensity=input.nextInt();
		input.nextLine(); //captures new line
		
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState=input.nextLine();
		
		RobotHazardAuditor auditor=new RobotHazardAuditor();
		
		try {
			double result=auditor.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
			
			System.out.println("Robot Hazard Risk Score: "+result);
		}catch(RobotSafetyException e) {
			System.out.println(e.getMessage());
		}finally {
			input.close();
		}
	}

}
