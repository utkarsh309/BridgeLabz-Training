package functional_interface;

//Interface
interface RentalVehicle {
 void rent();
 void returnVehicle();
}

//Car class
class Car implements RentalVehicle {

 @Override
 public void rent() {
     System.out.println("Car has been rented");
 }

 @Override
 public void returnVehicle() {
     System.out.println("Car has been returned");
 }
}

//Bike class
class Bike implements RentalVehicle {

 @Override
 public void rent() {
     System.out.println("Bike has been rented");
 }

 @Override
 public void returnVehicle() {
     System.out.println("Bike has been returned");
 }
}

//Bus class
class Bus implements RentalVehicle {

 @Override
 public void rent() {
     System.out.println("Bus has been rented");
 }

 @Override
 public void returnVehicle() {
     System.out.println("Bus has been returned");
 }
}

//Main class
public class VehicleRentalSystem {

 public static void main(String[] args) {

     RentalVehicle car = new Car();
     RentalVehicle bike = new Bike();
     RentalVehicle bus = new Bus();

     car.rent();
     car.returnVehicle();

     bike.rent();
     bike.returnVehicle();

     bus.rent();
     bus.returnVehicle();
 }
}
