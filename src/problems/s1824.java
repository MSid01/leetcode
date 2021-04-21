package problems;

/**
 * Minimum Sideway Jumps
 */
public class s1824 {
    public int minSideJumps(int[] obstacles) {
        int[] dp = new int[]{1, 0, 1};
        for (int o : obstacles) {
            if (o > 0)
                dp[o - 1] = 1_000_000;
            for (int i = 0; i < 3; ++i)
                if (o - 1 != i)
                    dp[i] = Math.min(dp[i], Math.min(dp[(i + 1) % 3], dp[(i + 2) % 3]) + 1);
        }
        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }
}