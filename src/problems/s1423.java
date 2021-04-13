package problems;

/**
 * Maximum Points You Can Obtain from Cards
 */
public class s1423 {
    public int maxScore(int[] a, int k) {
        int n = a.length, lSum = 0;
        for (int i = 0; i < k; i++)
            lSum += a[i];
        int max = lSum;
        for (int rSum = 0, i = 0; i < k; i++) {
            rSum += a[n - 1 - i];
            lSum -= a[k - 1 - i];
            max = Math.max(max, lSum + rSum);
        }
        return max;
    }
}