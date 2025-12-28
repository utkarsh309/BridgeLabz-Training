import java.util.Scanner;

// Create YoungestAndTallestFriends class
public class YoungestAndTallestFriends {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Store friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of each friend
        for (int index = 0; index < 3; index++) {
            ages[index] = input.nextInt();
            heights[index] = input.nextDouble();
        }

        // Call methods
        String youngestFriend = findYoungest(ages, names);
        String tallestFriend = findTallest(heights, names);

        // Display results
        System.out.println("The youngest friend is " + youngestFriend);
        System.out.println("The tallest friend is " + tallestFriend);

        // Close scanner
        input.close();
    }

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {

        int youngestIndex = 0;

        for (int index = 1; index < ages.length; index++) {
            if (ages[index] < ages[youngestIndex]) {
                youngestIndex = index;
            }
        }

        return names[youngestIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {

        int tallestIndex = 0;

        for (int index = 1; index < heights.length; index++) {
            if (heights[index] > heights[tallestIndex]) {
                tallestIndex = index;
            }
        }

        return names[tallestIndex];
    }
}
