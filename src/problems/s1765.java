package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Map of Highest Peak
 */
public class s1765 {
    public int[][] highestPeak(int[][] a) {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == 1) {
                    a[i][j] = 0;
                    q.offer(new int[]{i, j});
                } else a[i][j] = -1;
        int[] dir = {-1, 0, 1, 0, -1};
        while (!q.isEmpty()) {
            int rowCol[] = q.poll(), r = rowCol[0], c = rowCol[1];
            for (int i = 0; i < 4; i++) {
                int nr = r + dir[i], nc = c + dir[i + 1];
                if (nr < 0 || nr == a.length || nc < 0 || nc == a[0].length || a[nr][nc] != -1) continue;
                a[nr][nc] = a[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        return a;
    }
}
