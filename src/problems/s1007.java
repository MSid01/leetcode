package problems;

import java.util.Arrays;
import java.util.Optional;

/**
 * Minimum Domino Rotations For Equal Row
 */
public class s1007 {
    public int minDominoRotations(int[] t, int[] b) {
        int[][] c = new int[7][3];
        for (int i = 0; i < t.length; i++)
            if (t[i] != b[i]) {
                c[t[i]][0]++;
                c[b[i]][1]++;
            } else c[t[i]][2]++;
        Optional<int[]> r = Arrays.stream(c).filter(i -> i[0] + i[1] + i[2] == t.length).findFirst();
        return r.map(i -> Math.min(i[0], i[1])).orElse(-1);
    }
}