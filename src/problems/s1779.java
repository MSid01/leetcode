package problems;

/**
 * Find Nearest Point That Has the Same X or Y Coordinate
 */
public class s1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int r = -1, min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int xDiff = Math.abs(x - points[i][0]), yDiff = Math.abs(y - points[i][1]);
            if (xDiff == 0 && (r == -1 || yDiff < min)) {
                r = i;
                min = yDiff;
            } else if (yDiff == 0 && (r == -1 || xDiff < min)) {
                r = i;
                min = xDiff;
            }
        }
        return r;
    }
}
