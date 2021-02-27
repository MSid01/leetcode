package problems;

import java.util.TreeSet;

/**
 * The K Weakest Rows in a Matrix
 */
public class s1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        TreeSet<int[]> s = new TreeSet<>((o1, o2) -> o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0]);
        for (int r = 0; r < mat.length; r++) {
            int count = 0;
            for (int c = 0; c < mat[0].length; c++)
                if (mat[r][c] == 1)
                    count++;
            s.add(new int[]{r, count});
        }
        int[] r = new int[k];
        for (int i = 0; i < r.length; i++)
            r[i] = s.pollFirst()[0];
        return r;
    }
}
