package problems;

/**
 * Path with Maximum Gold
 */
public class s1219 {
    public int getMaximumGold(int[][] g) {
        int max = 0, dirs[] = {-1, 0, 1, 0, -1};
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] > 0)
                    max = Math.max(max, maxGold(g, i, j, dirs));
        return max;
    }

    int maxGold(int[][] g, int r, int c, int[] dirs) {
        if (r < 0 || r >= g.length || c < 0 || c >= g[0].length || g[r][c] == 0)
            return 0;
        int v = g[r][c], max = 0;
        g[r][c] = 0;
        for (int i = 1; i < dirs.length; i++)
            max = Math.max(max, maxGold(g, r + dirs[i - 1], c + dirs[i], dirs));
        g[r][c] = v;
        return max + v;
    }
}