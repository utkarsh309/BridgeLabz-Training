package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        String fileName = "input.txt";
        HashMap<String, Integer> map = new HashMap<>();

        // Read file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = line.split("\\s+");

                for (int i = 0; i < words.length; i++) {
                    String word = words[i];

                    if (!word.isEmpty()) {
                        if (map.containsKey(word)) {
                            map.put(word, map.get(word) + 1);
                        } else {
                            map.put(word, 1);
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
            return;
        }

        // Convert map to list
        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

       
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).getValue() > list.get(i).getValue()) {
                    // swap
                    Map.Entry<String, Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        // Print top 5
        System.out.println("Top 5 words:");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}
