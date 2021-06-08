package problems;

import java.util.Arrays;

/**
 * Count Sorted Vowel Strings
 */
public class s1641 {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][6];
        Arrays.fill(dp[0], 1);
        for (int i = 1; i <= n; i++)
            for (int k = 1; k <= 5; k++)
                dp[i][k] = dp[i][k - 1] + dp[i - 1][k];
        return dp[n][5];
    }
}