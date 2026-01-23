package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            String word = list.get(i);

            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        Map<String, Integer> result = countFrequency(fruits);

        System.out.println("Input: " + fruits);
        System.out.println("Output: " + result);
    }
}
