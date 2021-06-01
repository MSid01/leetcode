package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Distant Barcodes
 */
public class s1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int b : barcodes)
            m.put(b, m.getOrDefault(b, 0) + 1);
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int x : m.keySet())
            q.add(new int[]{x, m.get(x)});
        int r[] = new int[barcodes.length], i = 0;
        while (!q.isEmpty()) {
            int[] b = q.poll();
            while (b[1]-- > 0) {
                r[i] = b[0];
                i = i + 2 < barcodes.length ? i + 2 : 1;
            }
        }
        return r;
    }
}