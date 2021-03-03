package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Number of Equivalent Domino Pairs
 */
public class s1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> m = new HashMap<>();
        int count = 0;
        for (int[] d : dominoes) {
            int v = Math.min(d[0], d[1]) * 9 + Math.max(d[0], d[1]);
            count += m.getOrDefault(v, 0);
            m.put(v, m.getOrDefault(v, 0) + 1);
        }
        return count;
    }
}
