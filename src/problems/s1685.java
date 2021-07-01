package problems;

import java.util.Arrays;

/**
 * Sum of Absolute Differences in a Sorted Array
 */
public class s1685 {
    public int[] getSumAbsoluteDifferences(int[] a) {
        int r[] = new int[a.length], right = Arrays.stream(a).sum(), left = 0;
        for (int i = 0; i < a.length; i++) {
            right -= a[i];
            r[i] = a[i] * i - left + right - (a.length - i - 1) * a[i];
            left += a[i];
        }
        return r;
    }
}