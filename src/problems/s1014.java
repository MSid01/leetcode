package problems;

/**
 * Best Sightseeing Pair
 */
public class s1014 {
    public int maxScoreSightseeingPair(int[] vals) {
        int r = 0, left = vals[vals.length - 1], diff = 1;
        for (int i = vals.length - 2; i >= 0; i--, diff++) {
            r = Math.max(vals[i] + left - diff, r);
            if (diff + vals[i] >= left) {
                left = vals[i];
                diff = 0;
            }
        }
        return r;
    }
}