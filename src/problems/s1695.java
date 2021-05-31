package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Maximum Erasure Value
 */
public class s1695 {
    public int maximumUniqueSubarray(int[] a) {
        Set<Integer> s = new HashSet<>();
        int sum = 0, max = 0;
        for (int lo = 0, hi = 0; lo < a.length && hi < a.length; )
            if (s.add(a[hi])) {
                sum += a[hi++];
                max = Math.max(sum, max);
            } else {
                sum -= a[lo];
                s.remove(a[lo++]);
            }
        return max;
    }
}