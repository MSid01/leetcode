package problems;

/**
 * Maximum Difference Between Node and Ancestor
 */
public class s1026 {
    public int maxAncestorDiff(TreeNode root) {
        return maxDiff(root, root.val, root.val);
    }

    int maxDiff(TreeNode node, int min, int max) {
        if (node == null)
            return max - min;
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        return Math.max(maxDiff(node.left, min, max), maxDiff(node.right, min, max));
    }
}