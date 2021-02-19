package problems;

import java.util.Arrays;

/**
 * Richest Customer Wealth
 */
public class s1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] c : accounts)
            max = Math.max(Arrays.stream(c).sum(), max);
        return max;
    }
}
