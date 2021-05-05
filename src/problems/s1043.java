package problems;

/**
 * Partition Array for Maximum Sum
 */
public class s1043 {
    public int maxSumAfterPartitioning(int[] a, int K) {
        int[] dp = new int[a.length + 1];
        for (int i = 0; i < dp.length; i++) {
            int maxSum = 0, curMax = 0;
            for (int k = 1; k <= K && i - k >= 0; k++) {
                curMax = Math.max(curMax, a[i - k]);
                maxSum = Math.max(maxSum, dp[i - k] + curMax * k);
            }
            dp[i] = maxSum;
        }
        return dp[a.length];
    }
}