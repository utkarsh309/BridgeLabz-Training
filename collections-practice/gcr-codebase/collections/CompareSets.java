package collections;

import java.util.HashSet;
import java.util.Set;

public class CompareSets {

    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {

        //If sizes are different, not equal
        if (set1.size() != set2.size()) {
            return false;
        }

        //Check every element of set1 exists in set2
        for (Integer value : set1) {
            if (!set2.contains(value)) {
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
    }
}
