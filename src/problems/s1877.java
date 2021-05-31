package problems;

import java.util.Arrays;

/**
 * Minimize Maximum Pair Sum in Array
 */
public class s1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int min = 0, n = nums.length;
        for (int i = 0; i < n / 2; i++)
            min = Math.max(min, nums[i] + nums[n - 1 - i]);
        return min;
    }
}