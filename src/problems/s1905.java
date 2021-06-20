package problems;

/**
 * Count Sub Islands
 */
public class s1905 {
    public int countSubIslands(int[][] g1, int[][] g2) {
        int r = 0, dirs[] = {-1, 0, 1, 0, -1};
        for (int i = 0; i < g1.length; i++)
            for (int j = 0; j < g1[0].length; j++)
                if (g2[i][j] == 1 && sub(g2, i, j, dirs, g1))
                    r++;
        return r;
    }

    boolean sub(int[][] g2, int r, int c, int[] dirs, int[][] g1) {
        if (0 <= r && r < g2.length && 0 <= c && c < g2[0].length && g2[r][c] == 1) {
            g2[r][c] = 0;
            boolean sub = g1[r][c] == 1;
            for (int d = 1; d < dirs.length; d++)
                sub &= sub(g2, r + dirs[d - 1], c + dirs[d], dirs, g1);
            return sub;
        }
        return true;
    }
}