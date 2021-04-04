package problems;

/**
 * Delete N Nodes After M Nodes of a Linked List
 */
public class s1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode node = head, prev = null;
        while (node != null) {
            for (int i = m; node != null && i > 0; i--, node = node.next)
                prev = node;
            for (int j = n; node != null && j > 0; j--, node = node.next) ;
            prev.next = node;
        }
        return head;
    }
}
