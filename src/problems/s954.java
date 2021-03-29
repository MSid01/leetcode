package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Array of Doubled Pairs
 */
public class s954 {
    public boolean canReorderDoubled(int[] a) {
        Arrays.sort(a);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : a)
            if (i >= 0) {
                if (m.getOrDefault(i, 0) > 0)
                    m.put(i, m.get(i) - 1);
                else m.put(2 * i, m.getOrDefault(2 * i, 0) + 1);
            } else {
                if (m.getOrDefault(i, 0) > 0)
                    m.put(i, m.get(i) - 1);
                else {
                    if (i % 2 != 0)
                        return false;
                    m.put(i / 2, m.getOrDefault(i / 2, 0) + 1);
                }
            }
        for (Integer v : m.values())
            if (v != 0)
                return false;
        return true;
    }
}