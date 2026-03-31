package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {

            int value = list.get(i);

            if (!seen.contains(value)) {
                seen.add(value);
                result.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Input: " + numbers);

        List<Integer> output = removeDuplicates(numbers);

        System.out.println("Output: " + output);
    }
}
