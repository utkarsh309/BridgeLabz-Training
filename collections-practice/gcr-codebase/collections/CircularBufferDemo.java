package collections;

class CircularBuffer {

    int[] buffer;
    int size;
    int front = 0;
    int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void insert(int value) {

        int index = (front + count) % size;
        buffer[index] = value;

        if (count < size) {
            count++;
        } else {
            // remove oldest
            front = (front + 1) % size;
        }
    }

    void display() {
        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println("]");
    }
}

public class CircularBufferDemo {

    public static void main(String[] args) {

        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.display();   

        buffer.insert(2);
        buffer.display();   

        buffer.insert(3);
        buffer.display();   

        buffer.insert(4);
        buffer.display();   

        buffer.insert(5);
        buffer.display();   
    }
}
