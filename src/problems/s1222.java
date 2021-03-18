package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Queens That Can Attack the King
 */
public class s1222 {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] b = new boolean[8][8];
        for (int[] q : queens)
            b[q[0]][q[1]] = true;
        List<List<Integer>> r = new ArrayList<>(6);
        check(b, king, 0, 1, r);
        check(b, king, 0, -1, r);
        check(b, king, 1, 0, r);
        check(b, king, -1, 0, r);
        check(b, king, 1, 1, r);
        check(b, king, -1, -1, r);
        check(b, king, 1, -1, r);
        check(b, king, -1, 1, r);
        return r;
    }

    void check(boolean[][] b, int[] king, int dx, int dy, List<List<Integer>> r) {
        for (int x = king[0], y = king[1]; 0 <= x && x < 8 && 0 <= y && y < 8; y += dx, x += dy)
            if (b[x][y]) {
                r.add(Arrays.asList(x, y));
                return;
            }
    }
}
