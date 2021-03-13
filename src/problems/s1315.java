package problems;

/**
 * Sum of Nodes with Even-Valued Grandparent
 */
public class s1315 {
    public int sumEvenGrandparent(TreeNode root) {
        return sum(1, 1, root);
    }

    int sum(int g, int p, TreeNode node) {
        if (node == null) return 0;
        return (g % 2 == 0 ? node.val : 0) + sum(p, node.val, node.left) + sum(p, node.val, node.right);
    }
}
