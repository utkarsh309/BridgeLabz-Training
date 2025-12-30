//Create LineComparison class to compare two lines based on their lengths
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        
        //Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //user input for first line coordinates
        System.out.println("Enter x1 cordinate of first line:");
        int x1=input.nextInt();
        System.out.println("Enter y1 cordinate of first line:");
        int y1=input.nextInt();
        System.out.println("Enter x2 cordinate of first line:");
        int x2=input.nextInt();
        System.out.println("Enter y2 cordinate of first line:");
        int y2=input.nextInt();

        //Call the method to calculate length of first line
        Double lengthOne=calculateLength(x1, y1, x2, y2);

        //display length of first line
        System.out.println("Length of first line is: " + lengthOne);

        //user input for second line coordinates
        System.out.println("Enter x3 cordinate of second line:");
        int x3=input.nextInt();
        System.out.println("Enter y3 cordinate of second line:");
        int y3=input.nextInt();
        System.out.println("Enter x4 cordinate of second line:");
        int x4=input.nextInt();
        System.out.println("Enter y4 cordinate of second line:");
        int y4=input.nextInt();

        //Call the method to calculate length of second line
        Double lengthTwo=calculateLength(x3, y3, x4, y4);
        //display length of second line
        System.out.println("Length of second line is: " + lengthTwo);
        //Use case 2: Compare lengths of two lines
        //Compare lengths of two lines
        if(lengthOne.equals(lengthTwo)){
            System.out.println("Both lines are equal in length.");
        }
        else{
            System.out.println("Lines are not equal in length.");
        }



    }
    //Use case 1: Calculate length of first line
    //Method to calculate length of line using distance formula
    public static double calculateLength(int x1,int y1,int x2,int y2){

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
}
