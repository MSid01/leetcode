package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Clone N-ary Tree
 */
public class s1490 {
    public Node cloneTree(Node root) {
        if (root == null) return null;
        Node clone = new Node(root.val);
        root.children.forEach(c -> clone.children.add(cloneTree(c)));
        return clone;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}