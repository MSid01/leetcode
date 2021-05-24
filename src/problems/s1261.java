package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Find Elements in a Contaminated Binary Tree
 */
public class s1261 {
    class FindElements {
        final Set<Integer> vals = new HashSet<>();

        public FindElements(TreeNode root) { add(root, 0);}

        void add(TreeNode node, int val) {
            if (node != null) {
                vals.add(val);
                add(node.left, 2 * val + 1);
                add(node.right, 2 * val + 2);
            }
        }

        public boolean find(int target) { return vals.contains(target);}
    }

    class FindElements1 {
        final TreeNode root;

        public FindElements1(TreeNode root) {
            this.root = root;
        }

        public boolean find(int target) {
            String binary = Integer.toBinaryString(target + 1);
            TreeNode node = root;
            int i = 1;
            while (i < binary.length() && node != null)
                node = binary.charAt(i++) == '1' ? node.right : node.left;
            return node != null;
        }
    }
}
