package dsa;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] array) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        int prefixSum = 0;

        // For handling subarrays starting from index 0
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < array.length; i++) {

            prefixSum += array[i];

            if (map.containsKey(prefixSum)) {

                // If same sum appeared before, subarray is zero-sum
                for (int startIndex : map.get(prefixSum)) {
                    System.out.println("Zero-sum subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            // Store current index for this prefix sum
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] array = {3, 4, -7, 1, 3, -4, -2, -2};

        findZeroSumSubarrays(array);
    }
}
