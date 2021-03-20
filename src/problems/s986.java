package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Interval List Intersections
 */
public class s986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new LinkedList<>();
        for (int i = 0, j = 0; i < firstList.length && j < secondList.length; ) {
            int start = Math.max(firstList[i][0], secondList[j][0]), end = Math.min(firstList[i][1], secondList[j][1]);
            if (start <= end)
                list.add(new int[]{start, end});
            if (firstList[i][1] <= secondList[j][1])
                i++;
            else j++;
        }
        int[][] r = new int[list.size()][];
        for (int i = 0; i < list.size(); i++)
            r[i] = list.get(i);
        return r;
    }
}