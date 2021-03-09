package problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Cousins in Binary Tree
 */
public class s993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Map<Integer, Integer> parents = new HashMap<>();
            for (int size = q.size(); size > 0; size--) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                    parents.put(node.left.val, node.val);
                }
                if (node.right != null) {
                    q.add(node.right);
                    parents.put(node.right.val, node.val);
                }
            }
            Integer px = parents.get(x), py = parents.get(y);
            if (px != null || py != null)
                return px != null && py != null && !px.equals(py);
        }
        return false;
    }
}
