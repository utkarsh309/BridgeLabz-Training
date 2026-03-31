package scenario.aerovigil;

import java.util.HashMap;
public class FlightUtil {

	//Method to validate flight number
	public static boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		
		String regex="^FL-[1-9][0-9]{3}$";
		
		if(flightNumber.matches(regex)) {
			return true;
		}else {
			throw new InvalidFlightException("The Flight number "+flightNumber+" is invalid");
		}
	}
	
	//Method to validate flight name
	public static boolean validateFlightName(String flightName) throws InvalidFlightException {
		
		flightName=flightName.toLowerCase();
		String regex="\\b(spicejet|vistara|indigo|air arabia)\\b";
		
		if(flightName.matches(regex)) {
			return true;
		}else {
			throw new InvalidFlightException("The Flight name "+flightName+" is invalid");
		}
	}
	
	//Method to validate passenger count
	public static boolean validatePassengerCount(int passengerCount,String flightName) throws InvalidFlightException{
		
		HashMap<String,Integer> capacity=new HashMap<>();
		capacity.put("spicejet",396);
		capacity.put("vistara",615);
		capacity.put("indigo",230);
		capacity.put("air arabia", 130);
		
		if(passengerCount<=0||passengerCount>capacity.get(flightName)) {
			throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
			
		}else {
			return true;
		}
		
	}
	
	//Method to calculate fuel required to fill tank
	public static double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		
		HashMap<String ,Integer> fuelCapacity=new HashMap<>();
		fuelCapacity.put("spicejet",200_000);
		fuelCapacity.put("vistara",300_000);
		fuelCapacity.put("indigo",250_000);
		fuelCapacity.put("air arabia", 150_000);
		
		if(currentFuelLevel<0||currentFuelLevel>fuelCapacity.get(flightName)) {
			throw new InvalidFlightException("Invalid fuel level for "+flightName);
		}else {
			return fuelCapacity.get(flightName)-currentFuelLevel;
		}
		
	}
	
}
