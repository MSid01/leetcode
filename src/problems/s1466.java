package problems;

import java.util.*;

/**
 * Reorder Routes to Make All Paths Lead to the City Zero
 */
public class s1466 {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> g = new ArrayList<>(connections.length);
        for (int i = 0; i < n; i++)
            g.add(new ArrayList<>());
        for (int[] c : connections) {
            g.get(c[0]).add(c[1]);
            g.get(c[1]).add(-c[0]);
        }
        Set<Integer> seen = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        seen.add(0);
        int r = 0;
        while (!q.isEmpty())
            for (int v : g.get(q.poll()))
                if (seen.add(Math.abs(v))) {
                    q.offer(Math.abs(v));
                    r += v > 0 ? 1 : 0;
                }
        return r;
    }
}