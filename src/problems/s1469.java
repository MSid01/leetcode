package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All The Lonely Nodes
 */
public class s1469 {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        dfs(false, root, r);
        return r;
    }

    void dfs(boolean lonely, TreeNode node, List<Integer> r) {
        if (node == null)
            return;
        if(lonely)
            r.add(node.val);
        dfs(node.right == null, node.left, r);
        dfs(node.left == null, node.right, r);
    }
}
