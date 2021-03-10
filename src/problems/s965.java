package problems;

/**
 * Univalued Binary Tree
 */
public class s965 {
    public boolean isUnivalTree(TreeNode root) { return isUnival(root.val, root);}

    boolean isUnival(int val, TreeNode node) {
        if (node == null) return true;
        return val == node.val && isUnival(val, node.left) && isUnival(val, node.right);
    }
}