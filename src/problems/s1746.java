package problems;

/**
 * Maximum Subarray Sum After One Operation
 */
public class s1746 {
    public int maxSumAfterOperation(int[] a) {
        int[][] dp = new int[a.length][2];
        dp[0][0] = a[0];//dp[i][0] - max sum including a[i] with no squared elements
        dp[0][1] = a[0] * a[0];//dp[i][1] - max sum including a[i] with one squared element
        int max = dp[0][1];
        for (int i = 1; i < a.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0] + a[i], a[i]);
            dp[i][1] = Math.max(a[i] * a[i], Math.max(dp[i - 1][1] + a[i], dp[i - 1][0] + a[i] * a[i]));
            max = Math.max(max, dp[i][1]);
        }
        return max;
    }
}