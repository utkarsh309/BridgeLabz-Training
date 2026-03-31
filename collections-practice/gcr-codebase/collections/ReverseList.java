package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Method to reverse List
    public static void reverseList(List<Integer> list) {

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {

            // Swap elements
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        // ArrayList Example 
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);


        //LinkedList Example
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
