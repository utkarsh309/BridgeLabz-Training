package stream_api;

import java.util.*;
import java.util.stream.*;

public class SensorReadings {

	public static void main(String[] args) {
		
		List<Double> sensorReadings =
		        List.of(22.5, 28.9, 31.2, 19.8, 35.6, 25.0);

		
		double threshold = 30.0;

		sensorReadings.stream()
		        .filter(reading -> reading > threshold)
		        .forEach(reading ->
		                System.out.println("High reading: " + reading)
		        );

		
	}

}
