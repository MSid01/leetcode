package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Shift 2D Grid
 */
public class s1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int start = m * n - k % (m * n);
        LinkedList<List<Integer>> res = new LinkedList<>();
        for (int i = start; i < m * n + start; i++) {
            int j = i % (m * n), r = j / n, c = j % n;
            if ((i - start) % n == 0)
                res.add(new ArrayList<>(m));
            res.peekLast().add(grid[r][c]);
        }
        return res;
    }
}
