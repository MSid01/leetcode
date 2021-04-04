package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Rotting Oranges
 */
public class s994 {
    public int orangesRotting(int[][] g) {
        int fresh = 0, dirs[] = {-1, 0, 1, 0, -1}, n = g.length, m = g[0].length, minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (g[i][j] == 2)
                    q.add(new int[]{i, j});
                else if (g[i][j] == 1)
                    fresh++;
        if (fresh == 0) return 0;
        while (!q.isEmpty()) {
            minutes++;
            for (int size = q.size(); size > 0; size--) {
                int xy[] = q.poll(), x = xy[0], y = xy[1];
                for (int i = 1; i < dirs.length; i++) {
                    int x1 = x + dirs[i - 1], y1 = y + dirs[i];
                    if (0 <= x1 && x1 < n && 0 <= y1 && y1 < m && g[x1][y1] == 1) {
                        fresh--;
                        q.add(new int[]{x1, y1});
                        g[x1][y1] = 2;
                    }
                }
            }
        }
        return fresh == 0 ? minutes - 1 : -1;
    }
}