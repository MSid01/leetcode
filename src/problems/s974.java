package problems;

/**
 * Subarray Sums Divisible by K
 */
public class s974 {
    public int subarraysDivByK(int[] a, int k) {
        int m[] = new int[k], sum = 0, r = 0;
        m[0] = 1;
        for (int n : a) {
            sum = (sum + n % k + k) % k;
            r += m[sum]++;
        }
        return r;
    }
}