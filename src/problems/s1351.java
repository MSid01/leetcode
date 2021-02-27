package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Count Negative Numbers in a Sorted Matrix
 */
public class s1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{grid.length, grid[0].length - 1});
        while (!q.isEmpty()) {
            int[] rc = q.poll();
            for (int k = 0; k <= 1; k++) {
                int r = rc[0] - k, c = rc[1] - (1 - k);
                if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] < 0) {
                    count++;
                    grid[r][c] = 0;
                    q.add(new int[]{r, c});
                }
            }
        }
        return count;
    }

    public int countNegatives1(int[][] g) {
        int count = 0, r = g.length - 1, c = 0, m = g[0].length;
        while (r >= 0 && c < m)
            if (g[r][c] < 0) {
                count += m - c;
                r--;
            } else c++;
        return count;
    }
}
