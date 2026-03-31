package functional_interface;

//Interface with static conversion methods
interface UnitConverter {

 // Convert kilometers to miles
 static double kmToMiles(double km) {
     return km * 0.621371;
 }

 // Convert kilograms to pounds
 static double kgToPounds(double kg) {
     return kg * 2.20462;
 }
}

//Main class
public class UnitConversionTool {

 public static void main(String[] args) {

     double distanceKm = 50;
     double weightKg = 20;

     double miles = UnitConverter.kmToMiles(distanceKm);
     double pounds = UnitConverter.kgToPounds(weightKg);

     System.out.println(distanceKm + " km = " + miles + " miles");
     System.out.println(weightKg + " kg = " + pounds + " lbs");
 }
}