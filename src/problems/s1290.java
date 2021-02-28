package problems;

/**
 * Convert Binary Number in a Linked List to Integer
 */
public class s1290 {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        while (head != null) {
            n = (n << 1) | head.val;
            head = head.next;
        }
        return n;
    }
}
