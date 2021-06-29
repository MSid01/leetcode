package problems;

/**
 * Largest 1-Bordered Square
 */
public class s1139 {
    public int largest1BorderedSquare(int[][] g) {
        int[][] R = new int[g.length][g[0].length + 1], C = new int[g.length + 1][g[0].length];
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++) {
                R[i][j + 1] = g[i][j] == 1 ? R[i][j] + 1 : 0;
                C[i + 1][j] = g[i][j] == 1 ? C[i][j] + 1 : 0;
            }
        for (int L = Math.min(g.length, g[0].length); L > 0; L--)
            for (int i = 0; i <= g.length - L; i++)
                for (int j = 0; j <= g[0].length - L; j++)
                    if (g[i][j] == 1 && R[i][j + L] >= L && R[i + L - 1][j + L] >= L && C[i + L][j] >= L && C[i + L][j + L - 1] >= L)
                        return L * L;
        return 0;
    }
}