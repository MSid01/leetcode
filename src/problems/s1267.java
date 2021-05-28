package problems;

/**
 * Count Servers that Communicate
 */
public class s1267 {
    public int countServers(int[][] g) {
        int[] rows = new int[g.length], cols = new int[g[0].length];
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
        int r = 0;
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] == 1 && rows[i] + cols[j] > 2)
                    r++;
        return r;
    }
}