package collections;

import java.util.HashMap;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        //convert to lowercase
        text = text.toLowerCase();

        // remove punctuation
        text = text.replaceAll("[^a-z ]", "");

        // split into words
        String[] words = text.split(" ");

        // counting frequency using HashMap
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Print result
        System.out.println(map);
    }
}

