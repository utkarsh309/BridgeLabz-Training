package collections;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static void main(String[] args) {

        // First map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Result map
        Map<String, Integer> result = new HashMap<>();

        // Copy all from map1
        for (String key : map1.keySet()) {
            result.put(key, map1.get(key));
        }

        // Merge map2 into result
        for (String key : map2.keySet()) {

            if (result.containsKey(key)) {
                // If key already exists, sum the values
                result.put(key, result.get(key) + map2.get(key));
            } else {
                // Otherwise just add the key
                result.put(key, map2.get(key));
            }
        }

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        System.out.println("Merged Map: " + result);
    }
}
