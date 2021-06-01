package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Least Number of Unique Integers after K Removals
 */
public class s1481 {
    public int findLeastNumOfUniqueInts(int[] a, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : a)
            m.put(i, m.getOrDefault(i, 0) + 1);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.addAll(m.values());
        while (k > 0)
            k -= q.poll();
        return k < 0 ? q.size() + 1 : q.size();
    }
}