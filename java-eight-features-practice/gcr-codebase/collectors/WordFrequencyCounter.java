package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is easy and java is powerful";

        Map<String, Integer> wordCountMap =
                Arrays.stream(paragraph.split("\\s+"))
                        .collect(Collectors.toMap(
                                word -> word,        // key
                                word -> 1,           // initial value
                                (count1, count2) -> count1 + count2 // merge logic
                        ));

        wordCountMap.forEach(
                (word, count) ->
                        System.out.println(word + " -> " + count)
        );
    }
}

