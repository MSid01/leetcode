package problems;

/**
 * Maximum Ascending Subarray Sum
 */
public class s1800 {
    public int maxAscendingSum(int[] a) {
        int max = 0, sum = 0;
        for (int i = 0, j = 0; j < a.length; j++) {
            if (a[i] < a[j])
                sum += a[j];
            else sum = a[j];
            i = j;
            max = Math.max(max, sum);
        }
        return max;
    }
}