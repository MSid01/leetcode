package problems;

/**
 * Lowest Common Ancestor of a Binary Tree III
 */
public class s1650 {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p, b = q;
        while (a != b) {
            a = a == null ? q : a.parent;
            b = b == null ? p : b.parent;
        }
        return a;
    }

    class Node {
        public int val;
        public Node left, right, parent;
    }
}