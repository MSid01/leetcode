package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Root of N-Ary Tree
 */
public class s1506 {
    public Node findRoot(List<Node> nodes) {
        int sum = 0;
        for (Node node : nodes) {
            sum ^= node.val;
            for (Node child : node.children)
                sum ^= child.val;
        }
        for (Node node : nodes)
            if (node.val == sum)
                return node;
        return null;
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
