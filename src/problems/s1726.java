package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Tuple with Same Product
 */
public class s1726 {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int r = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                int p = nums[i] * nums[j];
                r += 8 * m.getOrDefault(p, 0);
                m.put(p, m.getOrDefault(p, 0) + 1);
            }
        return r;
    }
}