package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Even Odd Tree
 */
public class s1609 {
    public boolean isEvenOddTree(TreeNode root) {
        boolean even = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            for (int i = 0, size = q.size(), prevVal = even ? Integer.MIN_VALUE : Integer.MAX_VALUE; i < size; i++) {
                TreeNode node = q.poll();
                if (even && (prevVal >= node.val || node.val % 2 == 0))
                    return false;
                if (!even && (prevVal <= node.val || node.val % 2 != 0))
                    return false;
                prevVal = node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            even = !even;
        }
        return true;
    }
}
