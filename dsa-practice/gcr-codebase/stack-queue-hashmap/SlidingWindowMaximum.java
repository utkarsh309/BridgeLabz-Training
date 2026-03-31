package dsa;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static void findMaximum(int[] array, int k) {

        if (array == null || k <= 0 || k > array.length) {
            System.out.println("Invalid input");
            return;
        }

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {

            // Remove indices that are out of this window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && array[deque.peekLast()] < array[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Print max when first window is complete
            if (i >= k - 1) {
                System.out.print(array[deque.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Maximum in each window:");
        findMaximum(array, k);
    }
}
