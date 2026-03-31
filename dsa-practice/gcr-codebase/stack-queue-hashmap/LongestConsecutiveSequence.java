package dsa;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int findLongest(int[] array) {

        HashSet<Integer> set = new HashSet<>();

        //Add all elements to HashSet
        for (int num : array) {
            set.add(num);
        }

        int longestLength = 0;

        //Check for sequence starts
        for (int num : array) {

            // Only start counting if num is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count forward
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {

        int[] array = {100, 4, 200, 1, 3, 2};

        int result = findLongest(array);

        System.out.println("Longest consecutive sequence length: " + result);
    }
}
