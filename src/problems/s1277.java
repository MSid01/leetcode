package problems;

/**
 * Count Square Submatrices with All Ones
 */
public class s1277 {
    public int countSquares(int[][] m) {
        int r = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 1 && j > 0 && i > 0)
                    m[i][j] = Math.min(m[i - 1][j - 1], Math.min(m[i - 1][j], m[i][j - 1])) + 1;
                r += m[i][j];
            }
        return r;
    }
}