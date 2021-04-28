package problems;

/**
 * Maximum Average Subtree
 */
public class s1120 {
    public double maximumAverageSubtree(TreeNode root) { return dfs(root)[0];}

    double[] dfs(TreeNode node) {
        if (node == null)
            return new double[]{0, 0, 0};//max avr, sum, count
        double[] left = dfs(node.left), right = dfs(node.right);
        double sum = left[1] + right[1] + node.val, count = 1 + left[2] + right[2];
        return new double[]{Math.max(Math.max(left[0], right[0]), sum / count), sum, count};
    }
}