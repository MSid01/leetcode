package problems;

/**
 * Queries on Number of Points Inside a Circle
 */
public class s1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int r[] = new int[queries.length], i = 0;
        for (int[] q : queries) {
            for (int[] p : points)
                if ((p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]) <= q[2] * q[2])
                    r[i]++;
            i++;
        }
        return r;
    }
}