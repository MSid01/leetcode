package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Dot Product of Two Sparse Vectors
 */
public class s1570 {
    class SparseVector {
        final Map<Integer, Integer> m = new HashMap<>();

        SparseVector(int[] a) {
            for (int i = 0; i < a.length; i++)
                if (a[i] != 0)
                    m.put(i, a[i]);
        }

        public int dotProduct(SparseVector v) {
            if (m.size() > v.m.size())
                return v.dotProduct(this);
            int p = 0;
            for (Integer i : m.keySet())
                p += m.get(i) * v.m.getOrDefault(i, 0);
            return p;
        }
    }
}