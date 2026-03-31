package collections;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> union = new HashSet<>();

        // Add all elements of set1
        for (Integer value : set1) {
            union.add(value);
        }

        // Add elements of set2 (duplicates will be ignored)
        for (Integer value : set2) {
            union.add(value);
        }

        return union;
    }

    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> intersection = new HashSet<>();

        // Only add common elements
        for (Integer value : set1) {
            if (set2.contains(value)) {
                intersection.add(value);
            }
        }

        return intersection;
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

        Set<Integer> union = findUnion(set1, set2);
        Set<Integer> intersection = findIntersection(set1, set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}

