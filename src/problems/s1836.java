package problems;

/**
 * Remove Duplicates From an Unsorted Linked List
 */
public class s1836 {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode dummy1 = new ListNode(0, head), dummy2 = dummy1;
        int[] counts = new int[100_001];
        while (dummy2.next != null)
            counts[(dummy2 = dummy2.next).val]++;
        for (ListNode node = dummy1; node.next != null; )
            if (counts[node.next.val] > 1)
                node.next = node.next.next;
            else node = node.next;
        return dummy1.next;
    }
}