package problems;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Merge Triplets to Form Target Triplet
 */
public class s1899 {
    public boolean mergeTriplets(int[][] triplets, int[] t) {
        int[] r = new int[3];
        for (int[] tr : triplets)
            if (IntStream.range(0, 3).allMatch(i -> tr[i] <= t[i]))
                r = new int[]{Math.max(r[0], tr[0]), Math.max(r[1], tr[1]), Math.max(r[2], tr[2])};
        return Arrays.equals(r, t);
    }
}