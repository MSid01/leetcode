package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Balance a Binary Search Tree
 */
public class s1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        return toBst(vals, 0, vals.size() - 1);
    }

    TreeNode toBst(List<Integer> vals, int left, int right) {
        if (left > right)
            return null;
        int mid = (right + left) / 2;
        return new TreeNode(vals.get(mid), toBst(vals, left, mid - 1), toBst(vals, mid + 1, right));
    }

    void inorder(TreeNode root, List<Integer> vals) {
        if (root != null) {
            inorder(root.left, vals);
            vals.add(root.val);
            inorder(root.right, vals);
        }
    }
}