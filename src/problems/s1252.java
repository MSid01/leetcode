package problems;

/**
 * Cells with Odd Values in a Matrix
 */
public class s1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n], cols = new int[m];
        for (int[] idx : indices) {
            rows[idx[0]]++;
            cols[idx[1]]++;
        }
        int r = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                r += (rows[i] + cols[j]) % 2;
        return r;
    }
}