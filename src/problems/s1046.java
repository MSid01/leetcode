package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Last Stone Weight
 */
public class s1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(stones).forEach(q::offer);
        while (q.size() > 1)
            q.offer(q.poll() - q.poll());
        return q.poll();
    }
}
