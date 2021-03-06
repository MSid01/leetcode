package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Number of Good Pairs
 */
public class s1512 {
    public int numIdenticalPairs(int[] a) {
        Map<Integer, Integer> m = new HashMap<>();
        int r = 0;
        for (int i : a) {
            r += m.getOrDefault(i, 0);
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        return r;
    }
}
