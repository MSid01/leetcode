package problems;

import java.util.Arrays;

/**
 * Largest Subarray Length K
 */
public class s1708 {
    public int[] largestSubarray(int[] nums, int k) {
        int maxIdx = 0;
        for (int i = 1; i <= nums.length - k; i++)
            if (nums[maxIdx] < nums[i])
                maxIdx = i;
        return Arrays.copyOfRange(nums, maxIdx, maxIdx + k);
    }
}
