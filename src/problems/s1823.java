package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Find the Winner of the Circular Game
 */
public class s1823 {
    public int findTheWinner(int n, int k) {
        Node head = new Node(1), node = head;
        for (int i = 2; i <= n; node = node.next, i++)
            node.next = new Node(i);
        node.next = head;
        while (node.next != node) {
            for (int i = 1; i < k; i++)
                node = node.next;
            node.next = node.next.next;
        }
        return node.next.val;
    }

    class Node {
        int val;
        Node next;

        Node(int val) { this.val = val;}
    }

    public int findTheWinner1(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            q.add(i);
        while (q.size() > 1) {
            for (int i = 1; i < k; i++)
                q.add(q.remove());
            q.remove();
        }
        return q.remove();
    }
}