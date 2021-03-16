package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * All Elements in Two Binary Search Trees
 */
public class s1305 {
    public List<Integer> getAllElements(TreeNode r1, TreeNode r2) {
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        inOrder(q1, r1);
        inOrder(q2, r2);
        List<Integer> r = new ArrayList<>(q1.size() + q2.size());
        while (!q1.isEmpty() || !q2.isEmpty()) {
            if (q1.isEmpty())
                r.add(q2.remove());
            else if (q2.isEmpty())
                r.add(q1.remove());
            else if (q1.peek() <= q2.peek())
                r.add(q1.remove());
            else r.add(q2.remove());
        }
        return r;
    }

    void inOrder(Queue<Integer> q, TreeNode node) {
        if (node != null) {
            inOrder(q, node.left);
            q.add(node.val);
            inOrder(q, node.right);
        }
    }
}