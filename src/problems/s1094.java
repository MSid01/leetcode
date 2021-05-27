package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Car Pooling
 */
public class s1094 {
    public boolean carPooling1(int[][] trips, int C) {
        Arrays.sort(trips, Comparator.comparingInt(o -> o[1]));
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        int capacity = 0;
        for (int i = 0; i < trips.length && capacity <= C; capacity += trips[i++][0]) {
            while (!q.isEmpty() && q.peek()[2] <= trips[i][1])
                capacity -= q.poll()[0];
            q.add(trips[i]);
        }
        return capacity <= C;
    }

    public boolean carPooling(int[][] trips, int capacity) {
        int stops[] = new int[1001];
        for (int i = 0; i < trips.length; stops[trips[i][1]] += trips[i][0], stops[trips[i][2]] -= trips[i][0], i++) ;
        for (int i = 0; i < stops.length && capacity >= 0; capacity -= stops[i++]) ;
        return capacity >= 0;
    }
}
