package problems;

import java.util.Arrays;

/**
 * Minimum Difference Between Largest and Smallest Value in Three Moves
 */
public class s1509 {
    public int minDifference(int[] a) {
        if (a.length < 5)
            return 0;
        Arrays.sort(a);
        int r = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++)
            r = Math.min(r, a[a.length - 4 + i] - a[i]);
        return r;
    }
}