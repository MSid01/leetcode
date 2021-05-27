package problems;

import java.util.Arrays;

/**
 * Remove Covered Intervals
 */
public class s1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int end = intervals[0][1], r = intervals.length;
        for (int i = 1; i < intervals.length; i++)
            if (intervals[i][1] <= end)
                r--;
            else end = intervals[i][1];
        return r;
    }
}