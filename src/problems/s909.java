package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Snakes and Ladders
 */
public class s909 {
    public int snakesAndLadders(int[][] board) {
        int n = board.length, a[] = new int[n * n + 1], steps = 0;
        for (int r = n - 1, i = 1; r >= 0; r--) {
            for (int c = 0; c < n; c++)
                a[i++] = board[r][c];
            r--;
            for (int c = n - 1; c >= 0 && r >= 0; c--)
                a[i++] = board[r][c];
        }
        boolean[] seen = new boolean[n * n + 1];
        Queue<Integer> q = new LinkedList<>();
        int start = a[1] > -1 ? a[1] : 1;
        q.offer(start);
        seen[start] = true;
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; size--) {
                int i = q.poll();
                if (i == a.length - 1)
                    return steps;
                for (int d = 1; d <= 6 && d + i < a.length; d++) {
                    int dest = a[i + d] > -1 ? a[i + d] : i + d;
                    if (!seen[dest]) {
                        seen[dest] = true;
                        q.offer(dest);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}