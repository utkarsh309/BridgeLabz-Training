package collections;

import java.util.*;

public class InvertMap {

    public static void main(String[] args) {

        // Original map
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

        System.out.println("Original Map: " + original);

        // Inverted map
        Map<Integer, List<String>> inverted = new HashMap<>();

        // Loop through original map
        for (String key : original.keySet()) {

            int value = original.get(key);

            // If value not present, create new list
            if (!inverted.containsKey(value)) {
                inverted.put(value, new ArrayList<>());
            }

            // Add key to the list
            inverted.get(value).add(key);
        }

        System.out.println("Inverted Map: " + inverted);
    }
}
