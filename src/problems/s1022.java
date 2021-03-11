package problems;

/**
 * Sum of Root To Leaf Binary Numbers
 */
public class s1022 {
    public int sumRootToLeaf(TreeNode root) { return sum(0, root);}

    int sum(int v, TreeNode node) {
        if (node == null) return 0;
        v = v * 2 + node.val;
        return node.left == node.right ? v : sum(v, node.left) + sum(v, node.right);
    }
}
