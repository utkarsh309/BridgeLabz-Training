package oopsPillars;

import java.util.ArrayList;
import java.util.List;

// Abstract class (renamed)
abstract class RideVehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(vehicleId + " " + driverName);
    }
}

// Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Car class
class Car extends RideVehicle implements GPS {

    private String location = "Unknown";

    Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

// Bike class
class Bike extends RideVehicle implements GPS {

    private String location = "Unknown";

    Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

// Auto class
class Auto extends RideVehicle implements GPS {

    private String location = "Unknown";

    Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

// Main class
public class RideHailingApplication {

    public static void main(String[] args) {

        List<RideVehicle> rides = new ArrayList<>();

        rides.add(new Car("CAR101", "Amit", 15));
        rides.add(new Bike("BIKE202", "Ravi", 8));
        rides.add(new Auto("AUTO303", "Suresh", 12));

        calculateFareForAll(rides, 10);
    }

    
    public static void calculateFareForAll(List<RideVehicle> vehicles, double distance) {

        for (RideVehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare: " + v.calculateFare(distance));
            System.out.println();
        }
    }
}
