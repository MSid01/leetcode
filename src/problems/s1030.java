package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Matrix Cells in Distance Order
 */
public class s1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int res[][] = new int[R * C][2], i = 0;
        boolean[][] seen = new boolean[R][C];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r0, c0});
        while (!q.isEmpty()) {
            int p[] = q.poll(), r = p[0], c = p[1];
            if (0 <= r && r < R && 0 <= c && c < C && !seen[r][c]) {
                res[i++] = p;
                seen[r][c] = true;
                q.add(new int[]{r + 1, c});
                q.add(new int[]{r - 1, c});
                q.add(new int[]{r, c + 1});
                q.add(new int[]{r, c - 1});
            }
        }
        return res;
    }
}