package dsa;

import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            // If complement exists, return indices
            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            // Store current value with index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution found
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}

