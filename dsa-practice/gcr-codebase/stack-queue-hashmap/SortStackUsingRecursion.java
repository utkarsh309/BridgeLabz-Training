package dsa;

import java.util.Stack;

public class SortStackUsingRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {

        if (!stack.isEmpty()) {

            int top = stack.pop();

            // Recursively sort remaining stack
            sortStack(stack);

            // Insert element at correct position
            insertInSortedOrder(stack, top);
        }
    }

    //method to insert element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {

        // Base condition
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertInSortedOrder(stack, value);

        stack.push(top);
    }

    // Main method 
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting: " + stack);

        sortStack(stack);

        System.out.println("After sorting: " + stack);
    }
}
