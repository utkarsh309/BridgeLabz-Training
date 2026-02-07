package scenario.oceanfleet;

import java.util.List;
import java.util.ArrayList;

public class VesselUtil {

	private List<Vessel> vesselList=new ArrayList<>();
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		
		for(Vessel vessel:vesselList) {
			
			if(vessel.getVesselId().equals(vesselId)) {
				return vessel;
			}
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		
		double maximum=Integer.MIN_VALUE;
		List<Vessel> highPerformanceVessels=new ArrayList<>();
		
		for(Vessel vessel:vesselList) {
			
			if(vessel.getAverageSpeed()>maximum) {
				maximum=vessel.getAverageSpeed();
			}
		}
		
		for(Vessel vessel:vesselList) {
			if(vessel.getAverageSpeed()==(maximum)) {
				highPerformanceVessels.add(vessel);
			}
		}
		
		return highPerformanceVessels;
	}
}
