package problems;

import java.util.Stack;

/**
 * Print Immutable Linked List in Reverse
 */
public class s1265 {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> s = new Stack<>();
        while (head != null) {
            s.push(head);
            head = head.getNext();
        }
        while (!s.isEmpty())
            s.pop().printValue();
    }

    interface ImmutableListNode {
        void printValue(); // print the value of this node.

        ImmutableListNode getNext(); // return the next node.
    }
}
