package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Diameter of N-Ary Tree
 */
public class s1522 {
    int diameter = 0;

    public int diameter(Node root) {
        getHeight(root);
        return diameter;
    }

    int getHeight(Node node) {
        if (node == null)
            return 0;
        int max1 = 0, max2 = 0;
        for (Node child : node.children) {
            int height = getHeight(child);
            if (height > max1) {
                max2 = max1;
                max1 = height;
            } else if (height > max2)
                max2 = height;
        }
        diameter = Math.max(diameter, max1 + max2);
        return max1 + 1;
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
