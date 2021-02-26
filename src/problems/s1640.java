package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Check Array Formation Through Concatenation
 */
public class s1640 {
    public boolean canFormArray(int[] a, int[][] pieces) {
        Map<Integer, int[]> m = new HashMap<>();
        for (int[] p : pieces)
            m.put(p[0], p);
        for (int i = 0; i < a.length; ) {
            int[] p = m.get(a[i]);
            if (p == null) return false;
            for (int j = 0; j < p.length; j++, i++)
                if (p[j] != a[i])
                    return false;
        }
        return true;
    }
}
