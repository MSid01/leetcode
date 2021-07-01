package problems;

/**
 * Circle and Rectangle Overlapping
 */
public class s1401 {
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
        int closestX = closest(xc, x1, x2), closestY = closest(yc, y1, y2);
        int xd = closestX - xc, yd = closestY - yc;
        return xd * xd + yd * yd <= r * r;
    }

    int closest(int val, int min, int max) {
        return Math.max(min, Math.min(val, max));
    }
}