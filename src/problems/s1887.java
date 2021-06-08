package problems;

import java.util.Arrays;

/**
 * Reduction Operations to Make the Array Elements Equal
 */
public class s1887 {
    public int reductionOperations(int[] a) {
        int r = 0, j = a.length;
        Arrays.sort(a);
        for (int i = j - 1; i > 0; --i)
            if (a[i - 1] != a[i])
                r += j - i;
        return r;
    }
}