package problems;

import java.util.Arrays;

/**
 * Mean of Array After Removing Some Elements
 */
public class s1619 {
    public double trimMean(int[] a) {
        Arrays.sort(a);
        int k = a.length / 20, sum = 0;
        for (int i = k; i < a.length - k; i++)
            sum += a[i];
        return 1.0 * sum / (a.length - k - k);
    }
}
