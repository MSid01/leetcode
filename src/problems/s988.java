package problems;

/**
 * Smallest String Starting From Leaf
 */
public class s988 {
    String r = "|";

    public String smallestFromLeaf(TreeNode root) {
        return dfs(root, "");
    }

    String dfs(TreeNode node, String s) {
        if (node == null)
            return s;
        s = (char) (node.val + 'a') + s;
        if (node.left == null && node.right == null && r.compareTo(s) > 0)
            r = s;
        dfs(node.left, s);
        dfs(node.right, s);
        return r;
    }
}