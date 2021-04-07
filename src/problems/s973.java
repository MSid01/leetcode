package problems;

import java.util.PriorityQueue;

/**
 * K Closest Points to Origin
 */
public class s973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        for (int[] p : points) {
            q.add(p);
            if (q.size() > k)
                q.poll();
        }
        int r[][] = new int[q.size()][2], i = 0;
        for (int[] p : q)
            r[i++] = p;
        return r;
    }
}
