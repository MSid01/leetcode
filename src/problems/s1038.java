package problems;

/**
 * Binary Search Tree to Greater Sum Tree
 */
public class s1038 {
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null)
            bstToGst(root.right);
        root.val = sum + root.val;
        sum = root.val;
        if (root.left != null)
            bstToGst(root.left);
        return root;
    }
}
