package problems;

/**
 * Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */
public class s1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target)
            return cloned;
        TreeNode r = getTargetCopy(original.left, cloned.left, target);
        return r != null ? r : getTargetCopy(original.right, cloned.right, target);
    }
}