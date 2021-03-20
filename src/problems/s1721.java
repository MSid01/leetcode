package problems;

/**
 * Swapping Nodes in a Linked List
 */
public class s1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode n1 = null, n2 = null;
        for (ListNode n = head; n != null; n = n.next) {
            if (n2 != null)
                n2 = n2.next;
            else if (--k == 0) {
                n1 = n;
                n2 = head;
            }
        }
        int t = n1.val;
        n1.val = n2.val;
        n2.val = t;
        return head;
    }
}