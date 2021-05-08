package problems;

/**
 * Capacity To Ship Packages Within D Days
 */
public class s1011 {
    public int shipWithinDays(int[] weights, int D) {
        int lo = 0, hi = 0;
        for (int w : weights) {
            hi += w;
            lo = Math.max(lo, w);
        }
        while (lo < hi) {
            int shipCapacity = (lo + hi) / 2, days = 1, capacity = 0;
            for (int w : weights) {
                if (capacity + w > shipCapacity) {
                    days++;
                    capacity = 0;
                }
                capacity += w;
            }
            if (days > D)
                lo = shipCapacity + 1;
            else hi = shipCapacity;
        }
        return lo;
    }
}