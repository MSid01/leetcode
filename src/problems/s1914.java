package problems;

/**
 * Cyclically Rotating a Grid
 */
public class s1914 {
    public int[][] rotateGrid(int[][] g, int K) {
        for (int T = 0, B = g.length - 1, L = 0, R = g[0].length - 1; T < B && L < R; T++, B--, L++, R--) {
            int n = (B - T + R - L) * 2, k = K % n;
            while (k-- > 0) {
                int val = g[T][L];
                for (int c = L + 1; c <= R; c++)
                    g[T][c - 1] = g[T][c];
                for (int r = T + 1; r <= B; r++)
                    g[r - 1][R] = g[r][R];
                for (int c = R - 1; c >= L; c--)
                    g[B][c + 1] = g[B][c];
                for (int r = B - 1; r >= T; r--)
                    g[r + 1][L] = g[r][L];
                g[T + 1][L] = val;
            }
        }
        return g;
    }
}