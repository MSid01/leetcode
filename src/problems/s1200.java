package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Minimum Absolute Difference
 */
public class s1200 {
    public List<List<Integer>> minimumAbsDifference(int[] a) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 1, minDiff = Integer.MAX_VALUE; i < a.length; i++)
            if (a[i] - a[i - 1] <= minDiff) {
                if (a[i] - a[i - 1] < minDiff)
                    r.clear();
                r.add(Arrays.asList(a[i - 1], a[i]));
                minDiff = a[i] - a[i - 1];
            }
        return r;
    }
}
