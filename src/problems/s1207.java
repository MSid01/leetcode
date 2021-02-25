package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Unique Number of Occurrences
 */
public class s1207 {
    public boolean uniqueOccurrences(int[] a) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : a)
            m.put(i, m.getOrDefault(i, 0) + 1);
        Set<Integer> s = new HashSet<>();
        for (Integer freq : m.values())
            if (!s.add(freq))
                return false;
        return true;
    }
}
