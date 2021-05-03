package problems;

/**
 * Minimum Distance to the Target Element
 */
public class s1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        for (int i = start, j = start; ; i--, j++) {
            if (i >= 0 && nums[i] == target) return start - i;
            if (j < nums.length && nums[j] == target) return j - start;
        }
    }
}