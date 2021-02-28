package problems;

/**
 * Replace Elements with Greatest Element on Right Side
 */
public class s1299 {
    public int[] replaceElements(int[] a) {
        for (int i = a.length - 1, max = -1; i >= 0; i--) {
            int v = a[i];
            a[i] = max;
            max = Math.max(max, v);
        }
        return a;
    }
}
