package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Minimum Operations to Reduce X to Zero
 */
public class s1658 {
    public int minOperations(int[] a, int x) {
        int target = -x + Arrays.stream(a).sum(), sum = 0, r = Integer.MIN_VALUE;
        if (target == 0)
            return a.length;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (m.containsKey(sum - target))
                r = Math.max(r, i - m.get(sum - target));
            m.put(sum, i);
        }
        return r == Integer.MIN_VALUE ? -1 : a.length - r;
    }
}