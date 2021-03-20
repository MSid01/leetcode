package problems;

/**
 * Find Valid Matrix Given Row and Column Sums
 */
public class s1605 {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] m = new int[rowSum.length][colSum.length];
        for (int r = 0; r < rowSum.length; r++)
            for (int c = 0; c < colSum.length; c++) {
                int min = Math.min(rowSum[r], colSum[c]);
                m[r][c] = min;
                rowSum[r] -= min;
                colSum[c] -= min;
            }
        return m;
    }
}