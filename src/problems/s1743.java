package problems;

import java.util.*;

/**
 * Restore the Array From Adjacent Pairs
 */
public class s1743 {
    public int[] restoreArray(int[][] pairs) {
        int r[] = new int[pairs.length + 1], curr = 0, i = 0;
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int[] p : pairs) {
            m.computeIfAbsent(p[0], l -> new ArrayList<>(2)).add(p[1]);
            m.computeIfAbsent(p[1], s -> new ArrayList<>(2)).add(p[0]);
        }
        for (Integer key : m.keySet())
            if (m.get(key).size() == 1)
                curr = key;
        Set<Integer> used = new HashSet<>();
        used.add(curr);
        while (i < r.length) {
            r[i++] = curr;
            for (Integer next : m.get(curr))
                if (used.add(next))
                    curr = next;
        }
        return r;
    }
}