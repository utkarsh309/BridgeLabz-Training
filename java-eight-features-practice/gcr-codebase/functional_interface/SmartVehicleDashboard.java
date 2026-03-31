package functional_interface;

//Vehicle interface
interface Vehicle {

 void displaySpeed();

 // New feature added later
 default void displayBatteryPercentage() {
     System.out.println("Battery information not available for this vehicle");
 }
}

//Petrol-powered four wheeler
class SedanVehicle implements Vehicle {

 @Override
 public void displaySpeed() {
     System.out.println("Sedan speed: 80 km/h");
 }
}

//Two-wheeler
class TwoWheelerVehicle implements Vehicle {

 @Override
 public void displaySpeed() {
     System.out.println("Two-wheeler speed: 60 km/h");
 }
}

//Electric vehicle
class EVehicle implements Vehicle {

 @Override
 public void displaySpeed() {
     System.out.println("Electric vehicle speed: 90 km/h");
 }

 @Override
 public void displayBatteryPercentage() {
     System.out.println("Battery level: 75%");
 }
}

//Main class
public class SmartVehicleDashboard {

 public static void main(String[] args) {

     Vehicle sedan = new SedanVehicle();
     Vehicle twoWheeler = new TwoWheelerVehicle();
     Vehicle electric = new EVehicle();

     sedan.displaySpeed();
     sedan.displayBatteryPercentage();

     twoWheeler.displaySpeed();
     twoWheeler.displayBatteryPercentage();

     electric.displaySpeed();
     electric.displayBatteryPercentage();
 }
}