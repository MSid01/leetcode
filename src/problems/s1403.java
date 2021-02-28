package problems;

import java.util.*;

/**
 * Minimum Subsequence in Non-Increasing Order
 */
public class s1403 {
    public List<Integer> minSubsequence(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int totalSum = 0, sum = 0;
        for (int i : a) {
            q.add(i);
            totalSum += i;
        }
        List<Integer> r = new LinkedList<>();
        while (sum <= totalSum / 2) {
            r.add(q.peek());
            sum += q.poll();
        }
        return r;
    }
}
