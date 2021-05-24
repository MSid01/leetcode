package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Maximum Number of Events That Can Be Attended
 */
public class s1353 {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int r = 0;
        for (int d = events[0][0], i = 0; i < events.length || !q.isEmpty(); d++) {
            while (i < events.length && d == events[i][0])
                q.offer(events[i++][1]);
            while (!q.isEmpty() && q.peek() < d)
                q.poll();
            if(!q.isEmpty()){
                q.poll();
                r++;
            }
        }
        return r;
    }
}