package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Minimum Time to Collect All Apples in a Tree
 */
public class s1443 {
    public int minTime(int n, int[][] edges, List<Boolean> hasApples) {
        List<List<Integer>> g = new ArrayList<>(n);
        IntStream.range(0, n).forEach(u -> g.add(new ArrayList<>()));
        for (int[] v : edges) {
            g.get(v[0]).add(v[1]);
            g.get(v[1]).add(v[0]);
        }
        return dfs(0, g, hasApples, new HashSet<>());
    }

    int dfs(int u, List<List<Integer>> g, List<Boolean> hasApples, Set<Integer> seen) {
        seen.add(u);
        int r = g.get(u).stream().filter(v -> !seen.contains(v)).mapToInt(v -> dfs(v, g, hasApples, seen)).sum();
        return (r > 0 || hasApples.get(u)) && u != 0 ? r + 2 : r;
    }
}