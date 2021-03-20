package problems;

/**
 * Lowest Common Ancestor of Deepest Leaves
 */
public class s1123 {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int left = depth(root.left), right = depth(root.right);
        if (right > left)
            return lcaDeepestLeaves(root.right);
        else if (right < left)
            return lcaDeepestLeaves(root.left);
        return root;
    }

    int depth(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(depth(node.right), depth(node.left));
    }
}
