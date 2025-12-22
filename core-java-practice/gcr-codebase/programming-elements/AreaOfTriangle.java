//Create AreaOfTriangle class to calculate the area of a triangle in square inches and centimeter
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        
        //Create Scanner object to take input from the keyboard
        Scanner input=new Scanner(System.in);
        
        //Create variable to store base and height and take input from user
        double baseInCentimeter=input.nextDouble();
        double heightInCentimeter=input.nextDouble();

        //Conversion to inch : 1 inch=2.54cm
        double baseInInch=baseInCentimeter/2.54;
        double heightInInch=heightInCentimeter/2.54;

        //Calculate Area of triangle
        double areaInSquareCentimeter=(double)1/2*baseInCentimeter*heightInCentimeter;
        double areaInSquareInch=(double)1/2*baseInInch*heightInInch;

        //Display the result
        System.out.println("The Area of the triangle in sq in is "+areaInSquareInch+" and sq cm is "+areaInSquareCentimeter);
    }
}
