package collections;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> result = new HashSet<>();

        // Add elements from set1 that are not in set2
        for (Integer value : set1) {
            if (!set2.contains(value)) {
                result.add(value);
            }
        }

        // Add elements from set2 that are not in set1
        for (Integer value : set2) {
            if (!set1.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> result = symmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + result);
    }
}

