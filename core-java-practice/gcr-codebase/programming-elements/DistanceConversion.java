//Create DistanceConversion Class to convert Kilometers to miles

public class DistanceConversion {
    public static void main(String[]args){
        //Create a variable to store distance in kilometer
        double distanceInKilometers=10.8;

        //Conversion factor provided: 1km = 1.6 miles
        double conversionFactor=1.6;

        //Calculate miles
        double distanceInMiles=conversionFactor*distanceInKilometers;

        //Display result
        System.out.println("The distance " + distanceInKilometers +" km in miles is " +  distanceInMiles);

    }
    
}
