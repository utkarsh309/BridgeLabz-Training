//Create SimpleInterest class to calculate simple interest
import java.util.Scanner;
public class SimpleInterest {
    
    public static void main(String[] args) {
        
        //create scanner object to read input
        Scanner input = new Scanner(System.in);

        //take input from user
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        //call the method to calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        //display the result
        System.out.println("The Simple Interest is: " + simpleInterest+"for principal "+principal+", rate "+rate+"% and time "+time+" years.");
        //close the scanner
        input.close();
    }

    //Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
