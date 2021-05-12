package problems;

/**
 * Maximum Distance Between a Pair of Values
 */
public class s1855 {
    public int maxDistance(int[] a1, int[] a2) {
        int i = 0, j = 0, r = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] > a2[j])
                i++;
            else r = Math.max(r, j++ - i);
        }
        return r;
    }
}