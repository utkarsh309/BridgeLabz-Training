// Create LeetCode1TwoSum class to find indices of two numbers whose sum equals target
import java.util.Scanner;

public class LeetCode1TwoSum {

    // Method to find two indices whose values add up to target
    public static int[] twoSum(int[] nums, int target) {

        // Create result array to store indices
        int[] result = new int[2];

        // Loop through array elements
        for (int i = 0; i < nums.length; i++) {

            // Check elements after current index
            for (int j = i + 1; j < nums.length; j++) {

                // Check if sum matches target
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        // Return result 
        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Take input for array size
        int size = input.nextInt();

        // Create array to store numbers
        int[] nums = new int[size];

        // Take array elements input
        for (int index = 0; index < nums.length; index++) {
            nums[index] = input.nextInt();
        }

        // Take target value input
        int target = input.nextInt();

        // Call twoSum method
        int[] answer = twoSum(nums, target);

        // Display result
        System.out.println("Indices are: " + answer[0] + " and " + answer[1]);

        // Close scanner
        input.close();
    }
}
