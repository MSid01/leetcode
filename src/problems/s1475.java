package problems;

import java.util.Stack;

/**
 * Final Prices With a Special Discount in a Shop
 */
public class s1475 {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++)
            for (int j = i + 1; j < prices.length; j++)
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
        return prices;
    }

    public int[] finalPrices1(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i])
                a[s.pop()] -= a[i];
            s.push(i);
        }
        return a;
    }
}
