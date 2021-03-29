package problems;

/**
 * Where Will the Ball Fall
 */
public class s1706 {
    public int[] findBall(int[][] g) {
        int C = g[0].length, r[] = new int[C];
        for (int i = 0, c = 0; i < C; ++i, c = i) {
            for (int[] row : g) {
                int c1 = c + row[c];
                if (c1 < 0 || c1 >= C || row[c] != row[c1]) {
                    c = -1;
                    break;
                } else c = c1;
            }
            r[i] = c;
        }
        return r;
    }
}