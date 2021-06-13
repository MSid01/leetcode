package problems;

import java.util.*;

public class s1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] delVals) {
        Set<Integer> s = new HashSet<>();
        Arrays.stream(delVals).forEach(s::add);
        List<TreeNode> r = new ArrayList<>();
        if (!s.contains(root.val))
            r.add(root);
        dfs(root, r, s);
        return r;
    }

    TreeNode dfs(TreeNode node, List<TreeNode> r, Set<Integer> s) {
        if (node == null)
            return null;
        node.left = dfs(node.left, r, s);
        node.right = dfs(node.right, r, s);
        if (s.contains(node.val)) {
            if (node.left != null)
                r.add(node.left);
            if (node.right != null)
                r.add(node.right);
            return null;
        }
        return node;
    }
}