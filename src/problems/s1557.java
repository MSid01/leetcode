package problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Minimum Number of Vertices to Reach All Nodes
 */
public class s1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] deadEnd = new boolean[n];
        edges.forEach(e -> deadEnd[e.get(1)] = false);
        return IntStream.range(0, n).filter(i -> deadEnd[i]).boxed().collect(Collectors.toList());
    }
}