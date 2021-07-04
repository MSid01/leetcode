package problems;

import java.util.*;

/**
 * Diagonal Traverse II
 */
public class s1424 {
    public int[] findDiagonalOrder(List<List<Integer>> a) {
        int len = 0, maxKey = 0;
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int r = a.size() - 1; r >= 0; r--)
            for (int c = 0; c < a.get(r).size(); c++, len++) {
                m.putIfAbsent(r + c, new ArrayList<>());
                m.get(r + c).add(a.get(r).get(c));
                maxKey = Math.max(maxKey, r + c);
            }
        int r[] = new int[len], i = 0;
        for (int k = 0; k <= maxKey; k++)
            for (Integer v : m.getOrDefault(k, Collections.emptyList()))
                r[i++] = v;
        return r;
    }
}