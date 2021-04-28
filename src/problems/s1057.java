package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Campus Bikes
 */
public class s1057 {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] == b[1] ? a[2] - b[2] : a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < workers.length; i++)
            for (int j = 0; j < bikes.length; j++)
                q.add(new int[]{Math.abs(bikes[j][0] - workers[i][0]) + Math.abs(bikes[j][1] - workers[i][1]), i, j});
        int[] r = new int[workers.length];
        Arrays.fill(r, -1);
        Set<Integer> usedBikes = new HashSet<>();
        while (usedBikes.size() < workers.length) {
            int[] workerBike = q.poll();
            if (r[workerBike[1]] == -1 && usedBikes.add(workerBike[2]))
                r[workerBike[1]] = workerBike[2];
        }
        return r;
    }
}