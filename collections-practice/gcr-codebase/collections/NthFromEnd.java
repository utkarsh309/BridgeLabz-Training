package collections;

import java.util.LinkedList;

public class NthFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int n) {

        int slow = 0;
        int fast = n;

        while (fast < list.size()) {
            slow++;
            fast++;
        }

        return list.get(slow);
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        System.out.println("Answer: " + findNthFromEnd(list, n));
    }
}
