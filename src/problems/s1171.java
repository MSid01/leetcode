package problems;

import java.util.HashMap;
import java.util.Map;

public class s1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> m = new HashMap<>();
        m.put(0, dummy);
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            m.put(sum, node);
        }
        sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            node.next = m.get(sum).next;
        }
        return dummy.next;
    }
}