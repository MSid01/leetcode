package problems;

/**
 * Angle Between Hands of a Clock
 */
public class s1344 {
    public double angleClock(int h, int m) {
        double hd = h * 30 + m * 0.5, md = m * 6;
        double angle = Math.abs(md - hd);
        return Math.min(angle, 360 - angle);
    }
}