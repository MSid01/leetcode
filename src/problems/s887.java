package problems;

/**
 * Super Egg Drop
 */
public class s887 {
    public int superEggDrop(int K, int N) {
        int dp[][] = new int[N + 1][K + 1], m = 0;
        while (dp[m][K] < N) {
            m++;
            for (int k = 1; k <= K; k++)
                dp[m][k] = 1 + dp[m - 1][k - 1] + dp[m - 1][k];
        }
        return m;
    }
}