package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Maximum Units on a Truck
 */
public class s1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        Collections.addAll(q, boxTypes);
        int max = 0;
        while (truckSize > 0 && !q.isEmpty()) {
            int[] box = q.poll();
            int size = Math.min(box[0], truckSize);
            max += size * box[1];
            truckSize -= size;
        }
        return max;
    }

    public int maximumUnits1(int[][] boxes, int truckSize) {
        Arrays.sort(boxes, (b1, b2) -> b2[1] - b1[1]);
        int max = 0;
        for (int i = 0; i < boxes.length && truckSize > 0; i++) {
            int size = Math.min(boxes[i][0], truckSize);
            max += size * boxes[i][1];
            truckSize -= size;
        }
        return max;
    }
}
