package problems;

/**
 * Running Sum of 1d Array
 */
public class s1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        return nums;
    }
}
