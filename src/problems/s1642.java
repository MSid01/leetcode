package problems;

import java.util.PriorityQueue;

/**
 * Furthest Building You Can Reach
 */
public class s1642 {
    public int furthestBuilding(int[] h, int bricks, int ladders) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < h.length - 1; i++) {
            if (h[i + 1] > h[i])
                q.offer(h[i + 1] - h[i]);
            if (q.size() > ladders)
                bricks -= q.poll();
            if (bricks < 0)
                return i;
        }
        return h.length - 1;
    }
}