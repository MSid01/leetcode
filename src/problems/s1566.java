package problems;

/**
 * Detect Pattern of Length M Repeated K or More Times
 */
public class s1566 {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i < arr.length - m; i++) {
            int K = k - 1, j = i + m;
            while (j + m < arr.length && validPattern(arr, i, j, m)) {
                K--;
                if (K == 0)
                    return true;
                j += m;
            }
        }
        return false;
    }

    boolean validPattern(int[] a, int ps, int s, int len) {
        for (int i = 0; i < len; i++)
            if (a[ps + i] != a[s + i])
                return false;
        return true;
    }
}
