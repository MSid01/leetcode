package problems;

import java.util.Stack;

/**
 * Next Greater Node In Linked List
 */
public class s1019 {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> vals = new Stack<>(), s = new Stack<>();
        for (; head != null; head = head.next)
            vals.push(head.val);
        int[] r = new int[vals.size()];
        for (int i = r.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= vals.peek())
                s.pop();
            r[i] = !s.isEmpty() ? s.peek() : 0;
            s.push(vals.pop());
        }
        return r;
    }
}