package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * All Paths from Source Lead to Destination
 */
public class s1059 {
    public boolean leadsToDestination(int n, int[][] edges, int source, int dest) {
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int[] e : edges) {
            g.putIfAbsent(e[0], new HashSet<>());
            g.get(e[0]).add(e[1]);
        }
        if (g.containsKey(dest)) return false;
        return dfs(g, source, dest, new boolean[n]);
    }

    boolean dfs(Map<Integer, Set<Integer>> g, int source, int destination, boolean[] seen) {
        if (source == destination) return true;
        seen[source] = true;
        if (!g.containsKey(source)) return false;// Non-destination node must have outgoing edge, otherwise it is stuck.
        for (Integer v : g.get(source))
            if (seen[v] || !dfs(g, v, destination, seen))
                return false;
        seen[source] = false;
        return true;
    }
}