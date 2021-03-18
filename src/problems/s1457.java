package problems;

/**
 * Pseudo-Palindromic Paths in a Binary Tree
 */
public class s1457 {
    public int pseudoPalindromicPaths(TreeNode root) {
        return paths(root, 0);
    }

    int paths(TreeNode node, int n) {
        if (node == null) return 0;
        n ^= 1 << (node.val - 1);
        int r = paths(node.left, n) + paths(node.right, n);
        if (node.right == node.left && (n & (n - 1)) == 0)
            r++;
        return r;
    }
}