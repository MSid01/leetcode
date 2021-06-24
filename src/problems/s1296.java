package problems;

import java.util.Map;
import java.util.TreeMap;

/**
 * Divide Array in Sets of K Consecutive Numbers
 */
public class s1296 {
    public boolean isPossibleDivide(int[] a, int k) {
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i : a)
            m.put(i, m.getOrDefault(i, 0) + 1);
        for (Integer it : m.keySet())
            if (m.get(it) > 0)
                for (int i = k - 1; i >= 0; i--) {
                    if (m.get(it) > m.getOrDefault(it + i, 0))
                        return false;
                    m.put(it + i, m.get(it + i) - m.get(it));
                }
        return true;
    }
}