package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Lowest Common Ancestor of a Binary Tree IV
 */
public class s1676 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) { return lca(root, new HashSet<>(Arrays.asList(nodes)));}

    TreeNode lca(TreeNode node, Set<TreeNode> s) {
        if (node == null || s.contains(node)) return node;
        TreeNode left = lca(node.left, s), right = lca(node.right, s);
        if (left != null && right != null) return node;
        return left != null ? left : right;
    }
}