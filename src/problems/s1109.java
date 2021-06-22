package problems;

/**
 * Corporate Flight Bookings
 */
public class s1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] r = new int[n];
        for (int[] b : bookings) {
            r[b[0] - 1] += b[2];
            if (b[1] < n)
                r[b[1]] -= b[2];
        }
        for (int i = 1; i < n; i++)
            r[i] += r[i - 1];
        return r;
    }
}