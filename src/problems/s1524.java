package problems;

/**
 * Number of Sub-arrays With Odd Sum
 */
public class s1524 {
    public int numOfSubarrays(int[] a) {
        int r = 0, odd = 0, even = 0;
        for (int i : a) {
            if (i % 2 == 1) {
                int t = odd;
                odd = even + 1;
                even = t;
            } else even++;
            r = (r + odd) % 1_000_000_007;
        }
        return r;
    }
}