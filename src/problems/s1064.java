package problems;

/**
 * Fixed Point
 */
public class s1064 {
    public int fixedPoint(int[] a) {
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] - mid < 0)
                lo = mid + 1;
            else hi = mid;
        }
        return a[lo] == lo ? lo : -1;
    }
}