package problems;

import java.util.Arrays;

/**
 * Smallest String With A Given Numeric Value
 */
public class s1663 {
    public String getSmallestString(int n, int k) {
        char[] a = new char[n];
        Arrays.fill(a, 'a');
        for (int i = a.length - 1, t = k - n; i >= 0 && t > 0; i--, t -= 25)
            a[i] = (char) ('a' + Math.min(t, 25));
        return new String(a);
    }
}