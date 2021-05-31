package problems;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * Process Tasks Using Servers
 */
public class s1882 {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int[] r = new int[tasks.length];
        PriorityQueue<Integer> free = new PriorityQueue<>((a, b) -> servers[a] == servers[b] ? a - b : servers[a] - servers[b]);
        IntStream.range(0, servers.length).forEach(free::offer);
        PriorityQueue<int[]> running = new PriorityQueue<>((a, b) -> a[0] == b[0] ? servers[a[1]] == servers[b[1]] ? a[1] - b[1] : servers[a[1]] - servers[b[1]] : a[0] - b[0]);
        for (int i = 0; i < tasks.length; i++) {
            while (!running.isEmpty() && running.peek()[0] <= i)
                free.offer(running.poll()[1]);
            int[] s;
            if (free.isEmpty()) {
                s = running.poll();
                s[0] += tasks[i];
            } else s = new int[]{i + tasks[i], free.poll()};
            r[i] = s[1];
            running.offer(s);
        }
        return r;
    }
}