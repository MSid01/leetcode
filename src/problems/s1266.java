package problems;

/**
 * Minimum Time Visiting All Points
 */
public class s1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int min = 0;
        for (int i = 1; i < points.length; i++)
            min += Math.max(Math.abs(points[i - 1][0] - points[i][0]), Math.abs(points[i - 1][1] - points[i][1]));
        return min;
    }
}