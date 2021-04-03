package problems;

import java.util.Arrays;

/**
 * Two Sum Less Than K
 */
public class s1099 {
    public int twoSumLessThanK(int[] a, int k) {
        Arrays.sort(a);
        int r = -1;
        for (int i = 0, j = a.length - 1; i < j; )
            if (a[i] + a[j] < k)
                r = Math.max(r, a[i++] + a[j]);
            else j--;
        return r;
    }
}