package problems;

import java.util.*;

/**
 * Course Schedule IV
 */
public class s1462 {
    public List<Boolean> checkIfPrerequisite(int N, int[][] prerequisites, int[][] queries) {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for (int[] p : prerequisites) {
            m.putIfAbsent(p[1], new HashSet<>());
            m.get(p[1]).add(p[0]);
        }
        return null;

    }
}
