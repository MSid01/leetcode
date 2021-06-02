package problems;

/**
 * Egg Drop With 2 Eggs and N Floors
 */
public class s1884 {
    public int twoEggDrop1(int n) {
        return (int) Math.ceil((Math.sqrt(1 + 8 * n) - 1) / 2);
    }

    public int twoEggDrop(int n) {
        int eggs = 2;
        return drop(n, eggs, new int[n + 1][eggs + 1]);
    }

    int drop(int floors, int eggs, int[][] dp) {
        if (eggs == 1 || floors <= 1)
            return floors;
        if (dp[floors][eggs] > 0)
            return dp[floors][eggs];
        int min = Integer.MAX_VALUE;
        for (int f = 1; f <= floors; f++)
            min = Math.min(min, 1 + Math.max(drop(f - 1, eggs - 1, dp), drop(floors - f, eggs, dp)));
        dp[floors][eggs] = min;
        return min;
    }
}