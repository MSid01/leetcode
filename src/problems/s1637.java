package problems;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Widest Vertical Area Between Two Points Containing No Points
 */
public class s1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        int widest = 0;
        for (int i = 1; i < points.length; i++)
            widest = Math.max(widest, points[i][0] - points[i - 1][0]);
        return widest;
    }
}
