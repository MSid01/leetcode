package problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Lucky Numbers in a Matrix
 */
public class s1380 {
    public List<Integer> luckyNumbers(int[][] m) {
        Set<Integer> mins = new HashSet<>();
        List<Integer> r = new LinkedList<>();
        for (int[] row : m) {
            int min = row[0];
            for (int j = 1; j < row.length; j++)
                if (row[j] < min)
                    min = row[j];
            mins.add(min);
        }
        for (int j = 0; j < m[0].length; j++) {
            int max = m[0][j];
            for (int[] row : m)
                if (row[j] > max)
                    max = row[j];
            if (mins.contains(max))
                r.add(max);
        }
        return r;
    }
}
