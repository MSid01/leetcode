package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Recover a Tree From Preorder Traversal
 */
public class s1028 {
    public TreeNode recoverFromPreorder(String s) {
        Map<Integer, TreeNode> m = new HashMap<>();
        for (int i = 0, depth, val; i < s.length(); ) {
            for (depth = 0; s.charAt(i) == '-'; depth++, i++) ;
            for (val = 0; i < s.length() && s.charAt(i) != '-'; i++)
                val = 10 * val + (s.charAt(i) - '0');
            TreeNode node = new TreeNode(val);
            m.put(depth, node);
            if (depth > 0) {
                TreeNode p = m.get(depth - 1);
                if (p.left == null)
                    p.left = node;
                else p.right = node;
            }
        }
        return m.get(0);
    }
}