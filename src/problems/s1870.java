package problems;

/**
 * Minimum Speed to Arrive on Time
 */
public class s1870 {
    public int minSpeedOnTime(int[] dist, double hour) {
        int lo = 1, hi = 10_000_000, n = dist.length, r = -1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            double time = dist[n - 1] * 1.0 / mid;
            for (int i = 0; i < n - 1; i++)
                time += Math.ceil(dist[i] * 1.0 / mid);
            if (time <= hour) {
                r = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return r;
    }
}