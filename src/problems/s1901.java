package problems;

import java.util.Arrays;

public class s1901 {
    public int[] findPeakGrid(int[][] m) {
        for (int[] rc = {0, 0}, dirs = {-1, 0, 1, 0, -1}, peakRc = rc; ; rc = peakRc) {
            for (int d = 1; d < dirs.length; d++) {
                int r = rc[0] + dirs[d - 1], c = rc[1] + dirs[d];
                if (0 <= r && r < m.length && 0 <= c && c < m[0].length && m[r][c] > m[peakRc[0]][peakRc[1]])
                    peakRc = new int[]{r, c};
            }
            if (Arrays.equals(rc, peakRc))
                return rc;
        }
    }
}