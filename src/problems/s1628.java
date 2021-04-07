package problems;

import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

/**
 * Design an Expression Tree With Evaluate Function
 */
public class s1628 {
    abstract class Node { public abstract int evaluate();}

    class ValNode extends Node {
        final int val;

        ValNode(String s) { this.val = Integer.parseInt(s);}

        @Override public int evaluate() { return val;}
    }

    class OperatorNode extends Node {
        final Node left, right;
        final BiFunction<Integer, Integer, Integer> op;

        OperatorNode(Node left, Node right, BiFunction<Integer, Integer, Integer> op) {
            this.left = left;
            this.right = right;
            this.op = op;
        }

        @Override public int evaluate() { return op.apply(left.evaluate(), right.evaluate());}
    }

    class TreeBuilder {
        Node buildTree(String[] postfix) {
            Map<String, BiFunction<Integer, Integer, Integer>> ops = Map.of("+", (a, b) -> a + b, "-", (a, b) -> a - b, "*", (a, b) -> a * b, "/", (a, b) -> a / b);
            Stack<Node> s = new Stack<>();
            for (String str : postfix)
                if (ops.containsKey(str)) {
                    Node right = s.pop(), left = s.pop();
                    s.push(new OperatorNode(left, right, ops.get(str)));
                } else s.push(new ValNode(str));
            return s.pop();
        }
    }
}