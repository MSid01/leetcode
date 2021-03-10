package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Deepest Leaves Sum
 */
public class s1302 {
    public int deepestLeavesSum(TreeNode root) {
        int s = 0, size;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            for (size = q.size(), s = 0; size > 0; size--) {
                TreeNode node = q.poll();
                s += node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
        }
        return s;
    }
}
