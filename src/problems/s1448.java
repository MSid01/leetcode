package problems;

public class s1448 {
    public int goodNodes(TreeNode root) {
        return count(Integer.MIN_VALUE, root);
    }

    int count(int max, TreeNode node) {
        if (node == null) return 0;
        return (node.val >= max ? 1 : 0) + count(Math.max(max, node.val), node.left) + count(Math.max(max, node.val), node.right);
    }
}