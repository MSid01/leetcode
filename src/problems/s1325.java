package problems;

/**
 * Delete Leaves With a Given Value
 */
public class s1325 {
    public TreeNode removeLeafNodes(TreeNode root, int t) {
        if (root.left != null)
            root.left = removeLeafNodes(root.left, t);
        if (root.right != null)
            root.right = removeLeafNodes(root.right, t);
        return root.left == root.right && root.val == t ? null : root;
    }
}