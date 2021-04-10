package problems;

/**
 * Partition Array for Maximum Sum
 */
public class s1043 {
    public int maxSumAfterPartitioning(int[] a, int k) {
        int[] cache = new int[a.length];
        return maxSumAfterPartitioning(a, k, 0, cache);
    }

    int maxSumAfterPartitioning(int[] a, int k, int i, int[] cache) {
        if (cache[i] > 0)
            return cache[i];
        int sum = 0, maxSum = 0;
        for (int j = i; j < i + k && j < a.length; j++) {
            sum += a[j];
            maxSum = sum + maxSumAfterPartitioning(a, k);
        }
        return 0;
    }
}