package problems;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Parallel Courses
 */
public class s1136 {
    public int minimumSemesters(int n, int[][] relations) {
        Map<Integer, Set<Integer>> g = new HashMap<>();
        int inDegree[] = new int[n + 1], semesters = 0;
        for (int[] r : relations) {
            g.computeIfAbsent(r[0], k -> new HashSet<>()).add(r[1]);
            ++inDegree[r[1]];
        }
        Queue<Integer> q = new LinkedList<>();
        IntStream.range(1, n + 1).filter(i -> inDegree[i] == 0).forEach(q::offer);
        while (!q.isEmpty() && ++semesters > 0)
            for (int size = q.size(); size > 0; size--, n--)
                for (int v : g.getOrDefault(q.poll(), new HashSet<>()))
                    if (--inDegree[v] == 0)
                        q.offer(v);
        return n == 0 ? semesters : -1;
    }
}