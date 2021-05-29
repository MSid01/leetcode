package problems;

/**
 * Number of Closed Islands
 */
public class s1254 {
    public int closedIsland(int[][] g) {
        for (int i = 0; i < g.length; i++) {
            flood(i, 0, g);
            flood(i, g[0].length - 1, g);
        }
        for (int i = 0; i < g[0].length; i++) {
            flood(0, i, g);
            flood(g.length - 1, i, g);
        }
        int r = 0;
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] == 0)
                    r += flood(i, j, g) > 0 ? 1 : 0;
        return r;
    }

    int flood(int r, int c, int[][] g) {
        if (0 <= r && r < g.length && 0 <= c && c < g[0].length && g[r][c] == 0)
            return (g[r][c] = 1) + flood(r + 1, c, g) + flood(r - 1, c, g) + flood(r, c + 1, g) + flood(r, c - 1, g);
        return 0;
    }
}