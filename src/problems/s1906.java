package problems;

import java.util.Arrays;

/**
 * Minimum Absolute Difference Queries
 */
public class s1906 {
    public int[] minDifference(int[] a, int[][] q) {
        int dp[][] = new int[a.length + 1][101], r[] = new int[q.length];
        for (int i = 0; i < a.length; i++) {
            dp[i + 1] = Arrays.copyOf(dp[i], dp[i].length);
            dp[i + 1][a[i]]++;
        }
        for (int i = 0; i < r.length; i++) {
            int d1[] = dp[q[i][1] + 1], d2[] = dp[q[i][0]], min = Integer.MAX_VALUE, prev = -1;
            for (int k = 0; k < d1.length; k++)
                if (d1[k] > d2[k]) {
                    if (prev != -1)
                        min = Math.min(min, k - prev);
                    prev = k;
                }
            r[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return r;
    }
}