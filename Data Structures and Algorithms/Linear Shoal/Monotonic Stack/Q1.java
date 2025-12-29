//Q1. Final Prices With a Special Discount in a Shop
import java.util.*;
class Q1 {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = prices[i];
            } else {
                ans[i] = prices[i] - stack.peek();
            }

            stack.push(prices[i]);
        }

        return ans;
    }
}