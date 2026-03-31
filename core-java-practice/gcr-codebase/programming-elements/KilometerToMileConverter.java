//Create KilometerToMileConverter class to convert kilotometer to miles
import java.util.Scanner;
public class KilometerToMileConverter {
    public static void main(String[] args) {
        
        //Create Scanner object to take input from user
        Scanner input=new Scanner(System.in);

        //Create variable to store distance and take input from the user
        double distanceInKilometer=input.nextInt();

        //Conversion formula 1 mile= 1.6km
        double distanceInMiles=distanceInKilometer/1.6;

        //Display the result
        System.out.println("The total miles is "+ distanceInMiles+" mile for the given "+distanceInKilometer+" km");

        //Close the Scanner
        input.close();
    }
}
