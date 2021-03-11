package problems;

/**
 * Check If All 1's Are at Least Length K Places Away
 */
public class s1437 {
    public boolean kLengthApart(int[] nums, int k) {
        for (int start = -k - 1, i = 0; i < nums.length; i++)
            if (nums[i] == 1) {
                if (i - start - 1 < k) return false;
                start = i;
            }
        return true;
    }
}