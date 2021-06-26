package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * As Far from Land as Possible
 */
public class s1162 {
    public int maxDistance(int[][] g) {
        Queue<int[]> q = new LinkedList<>();
        int r = -1, dirs[] = {-1, 0, 1, 0, -1};
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g.length; j++)
                if (g[i][j] == 1)
                    q.offer(new int[]{i, j});
        if (q.size() == g.length * g.length)
            return -1;
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; size--) {
                int[] p = q.poll();
                for (int d = 1; d < dirs.length; d++) {
                    int x = p[0] + dirs[d - 1], y = p[1] + dirs[d];
                    if (0 <= x && x < g.length && 0 <= y && y < g.length && g[x][y] != 1) {
                        g[x][y] = 1;
                        q.offer(new int[]{x, y});
                    }
                }
            }
            r++;
        }
        return r;
    }
}