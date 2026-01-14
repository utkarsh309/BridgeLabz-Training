package dsa;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean hasPair(int[] array, int target) {

        HashSet<Integer> seen = new HashSet<>();

        for (int number : array) {

            int required = target - number;

            if (seen.contains(required)) {
                return true;
            }

            seen.add(number);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15};
        int target = 9;

        if (hasPair(array, target)) {
            System.out.println("Pair exists");
        } else {
            System.out.println("Pair does not exist");
        }
    }
}

