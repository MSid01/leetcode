package problems;

/**
 * Longest Turbulent Subarray
 */
public class s978 {
    public int maxTurbulenceSize(int[] a) {
        int up = 1, down = 1, r = 1;
        for (int i = 1; i < a.length; i++, r = Math.max(r, Math.max(up, down)))
            if (a[i - 1] < a[i]) {
                down = up + 1;
                up = 1;
            } else if (a[i - 1] > a[i]) {
                up = down + 1;
                down = 1;
            } else {
                up = 1;
                down = 1;
            }
        return r;
    }
}