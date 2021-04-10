package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Binary Search Tree Iterator II
 */
public class s1586 {
    class BSTIterator {
        Stack<TreeNode> nextStack = new Stack<>(), prevStack = new Stack<>();
        Set<TreeNode> seen = new HashSet<>();

        public BSTIterator(TreeNode root) {
            nextStack(root);
        }

        public boolean hasNext() { return !nextStack.isEmpty();}

        public int next() {
            TreeNode node = nextStack.pop();
            if (!seen.contains(node) && node.right != null)
                nextStack(node.right);
            seen.add(node);
            prevStack.push(node);
            return node.val;
        }

        public boolean hasPrev() { return prevStack.size() > 1;}

        public int prev() {
            nextStack.push(prevStack.pop());
            return prevStack.peek().val;
        }

        void nextStack(TreeNode node) {
            while (node != null) {
                nextStack.push(node);
                node = node.left;
            }
        }
    }
}