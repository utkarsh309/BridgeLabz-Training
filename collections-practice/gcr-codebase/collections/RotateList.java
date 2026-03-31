package collections;

import java.util.ArrayList;
import java.util.List;

public class RotateList {

    public static void rotateList(List<Integer> list, int k) {

        int n = list.size();
        k = k % n; // handle k > size

        // Temporary list to store first k elements
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }

        // Shift remaining elements to front
        for (int i = k; i < n; i++) {
            list.set(i - k, list.get(i));
        }

        // Add temp elements to end
        for (int i = 0; i < temp.size(); i++) {
            list.set(n - k + i, temp.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        int rotateBy = 2;
        rotateList(numbers, rotateBy);

        System.out.println("Rotated by " + rotateBy + ": " + numbers);
    }
}
