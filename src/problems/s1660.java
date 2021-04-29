package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Correct a Binary Tree
 */
public class s1660 {
    Set<Integer> seen = new HashSet<>();

    public TreeNode correctBinaryTree(TreeNode node) {
        if (node == null)
            return null;
        if (node.right != null && seen.contains(node.right.val))
            return null;
        seen.add(node.val);
        node.right = correctBinaryTree(node.right);
        node.left = correctBinaryTree(node.left);
        return node;
    }
}