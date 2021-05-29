package problems;

/**
 * Grumpy Bookstore Owner
 */
public class s1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        for (int i = 0; i < customers.length; i++)
            max += customers[i] * (i < minutes ? 1 : 1 - grumpy[i]);
        for (int i = minutes, curr = max; i < customers.length; i++)
            max = Math.max(max, curr = curr - customers[i - minutes] * grumpy[i - minutes] + customers[i] * grumpy[i]);
        return max;
    }
}
