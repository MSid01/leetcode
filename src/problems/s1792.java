package problems;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Maximum Average Pass Ratio
 */
public class s1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> q = new PriorityQueue<>((c1, c2) -> {
            double v1 = c1[0] * 1.0 / c1[1] - (c1[0] + 1) * 1.0 / (c1[1] + 1);
            double v2 = c2[0] * 1.0 / c2[1] - (c2[0] + 1) * 1.0 / (c2[1] + 1);
            if (v1 == v2) return 0;
            return v1 > v2 ? 1 : -1;
        });
        Collections.addAll(q, classes);
        while (extraStudents-- > 0) {
            int[] c = q.poll();
            c[0] += 1;
            c[1] += 1;
            q.add(c);
        }
        double s = 0;
        while (!q.isEmpty()) {
            int[] c = q.poll();
            s += c[0] * 1.0 / c[1];
        }
        return s / classes.length;
    }
}