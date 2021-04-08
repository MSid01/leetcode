package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove Interval
 */
public class s1272 {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] remove) {
        List<List<Integer>> r = new ArrayList<>();
        for (int[] i : intervals) {
            if (i[1] <= remove[0] || remove[1] <= i[0])
                r.add(Arrays.asList(i[0], i[1]));
            else {
                if (i[0] < remove[0])
                    r.add(Arrays.asList(i[0], remove[0]));
                if (i[1] > remove[1])
                    r.add(Arrays.asList(remove[1], i[1]));
            }
        }
        return r;
    }
}
