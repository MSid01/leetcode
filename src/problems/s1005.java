package problems;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Maximize Sum Of Array After K Negations
 */
public class s1005 {
    public int largestSumAfterKNegations(int[] a, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Arrays.stream(a).forEach(q::add);
        while (k-- > 0)
            q.add(-q.poll());
        return q.stream().mapToInt(i -> i).sum();
    }
}