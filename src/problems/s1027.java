package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Longest Arithmetic Subsequence
 */
public class s1027 {
    public int longestArithSeqLength(int[] a) {
        int r = 0;
        List<Map<Integer, Integer>> dp = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            Map<Integer, Integer> m = new HashMap<>();
            dp.add(m);
            for (int j = 0; j < i; j++) {
                int d = a[i] - a[j];
                m.put(d, dp.get(j).getOrDefault(d, 1) + 1);
                r = Math.max(r, m.get(d));
            }
        }
        return r;
    }
}