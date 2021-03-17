package problems;

import java.util.LinkedList;

/**
 * Queries on a Permutation With Key
 */
public class s1409 {
    public int[] processQueries(int[] queries, int m) {
        int[] r = new int[queries.length];
        LinkedList<Integer> p = new LinkedList<>();
        for (int i = 1; i <= m; i++)
            p.add(i);
        for (int i = 0; i < r.length; i++) {
            int idx = p.indexOf(queries[i]);
            r[i] = idx;
            p.remove(idx);
            p.addFirst(queries[i]);
        }
        return r;
    }
}