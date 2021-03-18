package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Maximum Level Sum of a Binary Tree
 */
public class s1161 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxLevel = 1, maxSum = root.val, level = 1;
        while (!q.isEmpty()) {
            int sum = 0;
            for (int size = q.size(); size > 0; size--) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}