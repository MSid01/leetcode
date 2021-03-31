package problems;

/**
 * Distribute Coins in Binary Tree
 */
public class s979 {
    int r = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return r;
    }

    int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int left = dfs(node.left), right = dfs(node.right);
        r += Math.abs(left) + Math.abs(right);
        return node.val + left + right - 1;
    }
}