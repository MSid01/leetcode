package problems;

/**
 * Maximum Subarray Sum with One Deletion
 */
public class s1186 {
    public int maximumSum(int[] a) {
        int oneDelete = 0, noDelete = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            oneDelete = Math.max(oneDelete + a[i], noDelete);
            noDelete = Math.max(noDelete + a[i], a[i]);
            max = Math.max(max, Math.max(oneDelete, noDelete));
        }
        return max;
    }
}