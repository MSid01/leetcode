package problems;

/**
 * Shuffle the Array
 */
public class s1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[nums.length];
        for (int i = 0, j = n, k = 0; i < n; i++, j++) {
            r[k++] = nums[i];
            r[k++] = nums[j];
        }
        return r;
    }
}
