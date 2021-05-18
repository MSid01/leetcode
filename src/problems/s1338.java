package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Reduce Array Size to The Half
 */
public class s1338 {
    public int minSetSize(int[] a) {
        int f[] = new int[100_001], size = 0;
        Arrays.stream(a).forEach(i -> f[i]++);
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(f).filter(i -> i > 0).forEach(q::offer);
        for (int len = a.length / 2; len > 0; size++, len -= q.poll()) ;
        return size;
    }
}