package problems;

/**
 * Construct Binary Search Tree from Preorder Traversal
 */
public class s1008 {
    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder, Integer.MAX_VALUE);
    }

    TreeNode bst(int[] a, int max) {
        if (i >= a.length || a[i] >= max)
            return null;
        TreeNode root = new TreeNode(a[i++]);
        root.left = bst(a, root.val);
        root.right = bst(a, max);
        return root;
    }
}
