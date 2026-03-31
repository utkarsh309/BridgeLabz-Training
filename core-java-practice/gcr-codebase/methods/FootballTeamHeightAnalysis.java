// Create FootballTeamHeightAnalysis class 
public class FootballTeamHeightAnalysis {

    public static void main(String[] args) {

        // Create array to store heights of 11 players
        int[] heights = new int[11];

        // Generate random heights between 150 cm and 250 cm
        for (int index = 0; index < heights.length; index++) {
            heights[index] = (int) (Math.random() * 101) + 150;
        }

        // Display all player heights
        System.out.println("Player Heights (in cm):");
        for (int index = 0; index < heights.length; index++) {
            System.out.println(heights[index]);
        }

        // Calculate sum, mean, shortest and tallest
        int sumOfHeights = findSum(heights);
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        // Display final results
        System.out.println("\n--- Football Team Height Statistics ---");
        System.out.println("Total Height = " + sumOfHeights + " cm");
        System.out.println("Mean Height = " + meanHeight + " cm");
        System.out.println("Shortest Height = " + shortestHeight + " cm");
        System.out.println("Tallest Height = " + tallestHeight + " cm");
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {

        int sum = 0;
        for (int index = 0; index < heights.length; index++) {
            sum = sum + heights[index];
        }
        return sum;
    }

    // Method to find mean height
    public static double findMeanHeight(int[] heights) {

        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortestHeight(int[] heights) {

        int shortest = heights[0];

        for (int index = 1; index < heights.length; index++) {
            if (heights[index] < shortest) {
                shortest = heights[index];
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallestHeight(int[] heights) {

        int tallest = heights[0];

        for (int index = 1; index < heights.length; index++) {
            if (heights[index] > tallest) {
                tallest = heights[index];
            }
        }
        return tallest;
    }
}
