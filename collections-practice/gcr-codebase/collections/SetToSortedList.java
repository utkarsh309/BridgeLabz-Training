package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {

    public static void main(String[] args) {

        // Create HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        System.out.println("Original Set: " + numbers);

        //Convert Set to List
        List<Integer> list = new ArrayList<>(numbers);

        //Sort the List
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
