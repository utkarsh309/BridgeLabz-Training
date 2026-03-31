import java.util.Scanner;

// Create EuclideanDistanceAndLineEquation class
public class EuclideanDistanceAndLineEquation {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for two points
        System.out.println("Enter x1 y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Find Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);

        // Find equation of line (slope and intercept)
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Display results
        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        input.close();
    }

    // Method to find Euclidean distance
    public static double findEuclideanDistance(double x1, double y1,double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }
}
