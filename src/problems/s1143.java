package problems;

/**
 * Longest Common Subsequence
 */
public class s1143 {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] dp = new int[t1.length() + 1][t2.length() + 1];
        for (int i = 0; i < t1.length(); i++)
            for (int j = 0; j < t2.length(); j++)
                dp[i + 1][j + 1] = t1.charAt(i) == t2.charAt(j) ? 1 + dp[i][j] : Math.max(dp[i][j + 1], dp[i + 1][j]);
        return dp[t1.length()][t2.length()];
    }
}