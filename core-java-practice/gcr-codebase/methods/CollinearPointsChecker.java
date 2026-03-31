import java.util.Scanner;

// Create CollinearPointsChecker class to check if 3 points are collinear
public class CollinearPointsChecker {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take input for three points
        System.out.println("Enter x1 y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter x3 y3:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Check collinearity using slope method
        boolean slopeResult = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area method
        boolean areaResult = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nUsing Slope Formula: " + slopeResult);
        System.out.println("Using Area Formula: " + areaResult);

        input.close();
    }

    // Method to check collinearity using slope formula (EXACT formula from question)
    public static boolean isCollinearUsingSlope(double x1, double y1,
                                                 double x2, double y2,
                                                 double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle formula (EXACT)
    public static boolean isCollinearUsingArea(double x1, double y1,
                                                double x2, double y2,
                                                double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));

        return area == 0;
    }
}
