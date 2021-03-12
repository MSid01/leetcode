package problems;

/**
 * Valid Boomerang
 */
public class s1037 {
    public boolean isBoomerang(int[][] p) {
        int[] p1 = p[0], p2 = p[1], p3 = p[2];
        return (p2[1] - p1[1]) * (p3[0] - p1[0]) != (p3[1] - p1[1]) * (p2[0] - p1[0]);
    }
}