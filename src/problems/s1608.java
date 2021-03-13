package problems;

import java.util.Arrays;

/**
 * Special Array With X Elements Greater Than or Equal X
 */
public class s1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0, x = 0; i < nums.length; i++)
            while (nums[i] > x) {
                x++;
                if (x == nums.length - i)
                    return x;
            }
        return -1;
    }
}
