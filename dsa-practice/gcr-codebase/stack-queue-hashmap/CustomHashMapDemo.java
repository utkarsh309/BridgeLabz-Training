package dsa;

class CustomHashMap {

    // Node class for Linked List
    class Node {
        int key;
        String value;
        Node next;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 10; // bucket size
    private Node[] buckets;

    // Constructor
    public CustomHashMap() {
        buckets = new Node[size];
    }

    // Hash function
    private int getIndex(int key) {
        return key % size;
    }

    // Insert or Update
    public void put(int key, String value) {

        int index = getIndex(key);
        Node head = buckets[index];

        // If bucket is empty
        if (head == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        // Check if key already exists
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value; // update
                return;
            }
            current = current.next;
        }

        // Insert at beginning (chaining)
        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // Retrieve value
    public String get(int key) {

        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return null; // not found
    }

    // Remove key
    public void remove(int key) {

        int index = getIndex(key);
        Node current = buckets[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                System.out.println("Key " + key + " removed");
                return;
            }

            previous = current;
            current = current.next;
        }

        System.out.println("Key not found");
    }
}

// Testing class
public class CustomHashMapDemo {

    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(12, "C++"); 

        System.out.println(map.get(1));  
        System.out.println(map.get(2));  
        System.out.println(map.get(12));

        map.remove(2);

        System.out.println(map.get(2));  
    }
}
