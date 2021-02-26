package problems;

import java.util.*;

/**
 * Create Target Array in the Given Order
 */
public class s1389 {
    public int[] createTargetArray(int[] a, int[] index) {
        Map<Integer, List<Integer>> m = new TreeMap<>();
        for (int i = index.length - 1; i >= 0; i--) {
            m.putIfAbsent(index[i], new LinkedList<>());
            m.get(index[i]).add(i);
        }
        int r[] = new int[a.length], i  = 0;
        for (Integer k : m.keySet())
            for (Integer j : m.get(k))
                r[i++] = a[j];
        return r;
    }
}
