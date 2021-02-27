package problems;

/**
 * Find N Unique Integers Sum up to Zero
 */
public class s1304 {
    public int[] sumZero(int n) {
        int[] r = new int[n];
        for (int i = 1; i < n; i++) {
            r[i] = i;
            r[0] -= i;
        }
        return r;
    }
}
