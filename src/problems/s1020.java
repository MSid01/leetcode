package problems;

import java.util.Arrays;

/**
 * Number of Enclaves
 */
public class s1020 {
    public int numEnclaves(int[][] grid) {
        int r = 0, dirs[] = {1, 0, -1, 0, 1};
        for (int i = 0; i < grid[0].length; i++) {
            dfs(grid, 0, i, dirs);
            dfs(grid, grid.length - 1, i, dirs);
        }
        for (int i = 0; i < grid.length; i++) {
            dfs(grid, i, 0, dirs);
            dfs(grid, i, grid[0].length - 1, dirs);
        }
        for (int[] row : grid)
            r += Arrays.stream(row).filter(v -> v == 1).count();
        return r;
    }

    void dfs(int[][] g, int r, int c, int[] dirs) {
        if (0 <= r && r < g.length && 0 <= c && c < g[0].length && g[r][c] == 1) {
            g[r][c] = 0;
            for (int i = 1; i < dirs.length; i++)
                dfs(g, r + dirs[i - 1], c + dirs[i], dirs);
        }
    }
}