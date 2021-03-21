package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Rank Transform of an Array
 */
public class s1331 {
    public int[] arrayRankTransform(int[] a) {
        int[] r = Arrays.copyOf(a, a.length);
        Arrays.sort(r);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : r)
            m.putIfAbsent(i, m.size() + 1);
        for (int i = 0; i < a.length; i++)
            r[i] = m.get(a[i]);
        return r;
    }
}