package dsa;

import java.util.Stack;

public class StockSpan {

    public static void calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        // Print result
        for (int s : span) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}

