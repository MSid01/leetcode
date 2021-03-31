package problems;

import java.util.*;

/**
 * Find Distance in a Binary Tree
 */
public class s1740 {
    public int findDistance(TreeNode root, int v1, int v2) {
        if (v1 == v2) return 0;
        Map<Integer, List<Integer>> g = new HashMap<>();
        g.put(root.val, new ArrayList<>());
        dfs(root, root.left, g);
        dfs(root, root.right, g);
        int d = 0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        visited.add(v1);
        while (!q.isEmpty()) {
            d++;
            for (int size = q.size(); size > 0; size--) {
                Integer v = q.poll();
                List<Integer> vals = g.get(v);
                for (Integer val : vals)
                    if (val == v2)
                        return d;
                    else if (visited.add(val))
                        q.add(val);
            }
        }
        return 0;
    }

    void dfs(TreeNode parent, TreeNode node, Map<Integer, List<Integer>> g) {
        if (node != null) {
            g.get(parent.val).add(node.val);
            g.put(node.val, new ArrayList<>());
            g.get(node.val).add(parent.val);
            dfs(node, node.left, g);
            dfs(node, node.right, g);
        }
    }
}
