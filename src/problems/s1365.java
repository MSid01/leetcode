package problems;

/**
 * How Many Numbers Are Smaller Than the Current Number
 */
public class s1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[102], smaller = new int[nums.length];
        for (int n : nums)
            counts[n + 1]++;
        for (int i = 1; i < counts.length; i++)
            counts[i] += counts[i - 1];
        for (int i = 0; i < nums.length; i++)
            smaller[i] = counts[nums[i]];
        return smaller;
    }
}
