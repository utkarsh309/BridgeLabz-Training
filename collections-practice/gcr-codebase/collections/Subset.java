package collections;

import java.util.HashSet;
import java.util.Set;

public class Subset {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {

        // Check every element of set1
        for (Integer value : set1) {
            if (!set2.contains(value)) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("Is Set1 a subset of Set2? " + isSubset(set1, set2));
    }
}
