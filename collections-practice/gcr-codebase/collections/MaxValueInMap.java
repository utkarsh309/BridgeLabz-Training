package collections;

import java.util.HashMap;
import java.util.Map;

public class MaxValueInMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Go through each entry
        for (String key : map.keySet()) {

            int value = map.get(key);

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        System.out.println("Map: " + map);
        System.out.println("Key with highest value: " + maxKey);
    }
}
