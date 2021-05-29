package problems;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Min Cost to Connect All Points
 */
public class s1584 {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int minCost = 0;
        boolean[] connected = new boolean[points.length];
        for (int i = 0, size = points.length - 1, p[]; size > 0; size--, p = q.poll(), minCost += p[0], i = p[1]) {
            connected[i] = true;
            for (int j = 1; j < points.length; j++)
                if (!connected[j])
                    q.offer(new int[]{Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]), j});
            while (connected[q.peek()[1]])
                q.poll();
        }
        return minCost;
    }
}