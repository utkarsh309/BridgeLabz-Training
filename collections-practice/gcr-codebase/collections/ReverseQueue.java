package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

        Queue<Integer> tempQueue = new LinkedList<>();

        while (!queue.isEmpty()) {

            // Take element from original queue
            int current = queue.remove();

            // Add it to tempQueue
            tempQueue.add(current);

            // Rotate existing elements in tempQueue
            int size = tempQueue.size();
            for (int i = 0; i < size - 1; i++) {
                tempQueue.add(tempQueue.remove());
            }
        }

        return tempQueue;
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        Queue<Integer> reversed = reverseQueue(queue);

        System.out.println("Reversed Queue: " + reversed);
    }
}
