package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Shortest Path in Binary Matrix
 */
public class s1091 {
    public int shortestPathBinaryMatrix(int[][] g) {
        int r = 0, n = g.length;
        Queue<int[]> q = new LinkedList<>();
        if (g[0][0] == 0) {
            q.add(new int[]{0, 0});
            g[0][0] = 1;
        }
        while (!q.isEmpty() && r++ > -1)
            for (int size = q.size(); size > 0; size--) {
                int p[] = q.poll();
                if (p[0] == n - 1 && p[1] == n - 1)
                    return r;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++) {
                        int x = p[0] + i, y = p[1] + j;
                        if (0 <= x && x < n && 0 <= y && y < n && g[x][y] == 0) {
                            q.offer(new int[]{x, y});
                            g[x][y] = 1;
                        }
                    }
            }
        return -1;
    }
}