package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Reduce Array Size to The Half
 */
public class s1338 {
    public int minSetSize(int[] a) {
        int f[] = new int[100_001], len = a.length / 2, minSize = 0;
        for (int i : a)
            f[i]++;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(f).filter(i -> i > 0).forEach(q::offer);
        while (len > 0) {
            len -= q.poll();
            minSize++;
        }
        return minSize;
    }
}