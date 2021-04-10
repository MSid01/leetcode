package problems;

import java.util.Stack;

/**
 * Two Sum BSTs
 */
public class s1214 {
    public boolean twoSumBSTs(TreeNode r1, TreeNode r2, int t) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        while (true) {
            while (r1 != null) {
                s1.push(r1);
                r1 = r1.left;
            }
            while (r2 != null) {
                s2.push(r2);
                r2 = r2.right;
            }
            if (s1.isEmpty() || s2.isEmpty()) return false;
            int sum = s1.peek().val + s2.peek().val;
            if (sum == t)
                return true;
            if (sum < t) {
                r1 = s1.peek().right;
                s1.pop();
            } else {
                r2 = s2.peek().left;
                s2.pop();
            }
        }
    }
}