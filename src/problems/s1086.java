package problems;

import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * High Five
 */
public class s1086 {
    public int[][] highFive(int[][] items) {
        TreeMap<Integer, PriorityQueue<Integer>> m = new TreeMap<>();
        for (int[] i : items) {
            m.putIfAbsent(i[0], new PriorityQueue<>());
            PriorityQueue<Integer> q = m.get(i[0]);
            q.add(i[1]);
            if (q.size() > 5)
                q.poll();
        }
        int r[][] = new int[m.size()][2], i = 0;
        for (Integer id : m.keySet())
            r[i++] = new int[]{id, m.get(id).stream().mapToInt(e -> e).sum() / 5};
        return r;
    }
}
