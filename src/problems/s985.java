package problems;

import java.util.Arrays;

/**
 * Sum of Even Numbers After Queries
 */
public class s985 {
    public int[] sumEvenAfterQueries(int[] a, int[][] queries) {
        int r[] = new int[queries.length], s = Arrays.stream(a).filter(i -> i % 2 == 0).sum();
        for (int i = 0; i < queries.length; i++) {
            int v = queries[i][0], idx = queries[i][1];
            s -= a[idx] % 2 == 0 ? a[idx] : 0;
            a[idx] += v;
            s += a[idx] % 2 == 0 ? a[idx] : 0;
            r[i] = s;
        }
        return r;
    }
}
