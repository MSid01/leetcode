package problems;

import java.util.Arrays;

/**
 * Largest Perimeter Triangle
 */
public class s976 {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);
        for (int i = a.length - 4; i >= 0; i--)
            if (a[i - 2] + a[i - 1] > a[i])
                return a[i - 2] + a[i - 1] + a[i];
        return 0;
    }
}
