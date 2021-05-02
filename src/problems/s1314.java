package problems;

/**
 * Matrix Block Sum
 */
public class s1314 {
    public int[][] matrixBlockSum(int[][] m, int k) {
        int R = m.length, C = m[0].length, cs[][] = new int[m.length + 1][m[0].length + 1];
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                cs[i + 1][j + 1] = cs[i + 1][j] + cs[i][j + 1] - cs[i][j] + m[i][j];
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++) {
                int r1 = Math.max(0, i - k), c1 = Math.max(0, j - k), r2 = Math.min(R, i + k + 1), c2 = Math.min(C, j + k + 1);
                m[i][j] = cs[r2][c2] - cs[r2][c1] - cs[r1][c2] + cs[r1][c1];
            }
        return m;
    }
}