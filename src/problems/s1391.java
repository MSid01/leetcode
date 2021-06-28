package problems;

import java.util.Map;

/**
 * Check if There is a Valid Path in a Grid
 */
public class s1391 {
    public boolean hasValidPath(int[][] g) {
        if (g.length == 1 && g[0].length == 1)
            return true;
        Map<Integer, Map<Integer, int[]>> m = Map.of(
                0, Map.of(),
                1, Map.of(0, new int[]{0, 1, 0}, 2, new int[]{0, -1, 2}),
                2, Map.of(1, new int[]{1, 0, 1}, 3, new int[]{-1, 0, 3}),
                3, Map.of(0, new int[]{1, 0, 1}, 3, new int[]{0, -1, 2}),
                4, Map.of(3, new int[]{0, 1, 0}, 2, new int[]{1, 0, 1}),
                5, Map.of(0, new int[]{-1, 0, 3}, 1, new int[]{0, -1, 2}),
                6, Map.of(1, new int[]{0, 1, 0}, 2, new int[]{-1, 0, 3})
        );
        Map<Integer, int[]> map = m.get(g[0][0]);
        for (int[] d : map.values())
            if (check(d[0], d[1], g, d[2], m))
                return true;
        return false;
    }

    boolean check(int r, int c, int[][] g, int dir, Map<Integer, Map<Integer, int[]>> m) {
        if (0 <= r && r < g.length && 0 <= c && c < g[0].length) {
            int[] v = m.get(g[r][c]).get(dir);
            if (v != null) {
                if (r == g.length - 1 && c == g[0].length - 1)
                    return true;
                g[r][c] = 0;
                return check(r + v[0], c + v[1], g, v[2], m);
            }
        }
        return false;
    }
}