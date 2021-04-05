package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Finding the Users Active Minutes
 */
public class s1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for (int[] log : logs) {
            m.putIfAbsent(log[0], new HashSet<>());
            m.get(log[0]).add(log[1]);
        }
        int[] r = new int[k];
        for (Integer id : m.keySet())
            r[m.get(id).size() - 1]++;
        return r;
    }
}