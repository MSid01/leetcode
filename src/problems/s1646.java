package problems;

import java.util.Arrays;

/**
 * Get Maximum in Generated Array
 */
public class s1646 {
    public int getMaximumGenerated(int n) {
        if (n <= 1)
            return n;
        int[] a = new int[n + 1];
        a[1] = 1;
        for (int i = 1; 2 * i + 1 <= n; i++) {
            a[2 * i] = a[i];
            a[2 * i + 1] = a[i] + a[i + 1];
        }
        return Arrays.stream(a).max().getAsInt();
    }
}