package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Single-Threaded CPU
 */
public class s1834 {
    public int[] getOrder(int[][] tasks) {
        for (int i = 0; i < tasks.length; i++)
            tasks[i] = new int[]{tasks[i][0], tasks[i][1], i};
        Arrays.sort(tasks, Comparator.comparingInt(t -> t[0]));
        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] != o2[1] ? o1[1] - o2[1] : o1[2] - o2[2]);
        int r[] = new int[tasks.length], i = 0, time = tasks[0][0];
        for (int j = 0; j < tasks.length; )
            if (tasks[j][0] <= time)
                q.offer(tasks[j++]);
            else if (q.isEmpty()) {
                q.offer(tasks[j]);
                time = tasks[j++][0];
            } else {
                int[] t = q.poll();
                r[i++] = t[2];
                time += t[1];
            }
        while (!q.isEmpty())
            r[i++] = q.poll()[2];
        return r;
    }
}