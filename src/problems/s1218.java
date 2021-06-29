package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Arithmetic Subsequence of Given Difference
 */
public class s1218 {
    public int longestSubsequence(int[] a, int d) {
        Map<Integer, Integer> dp = new HashMap<>();
        int r = 1;
        for (int n : a) {
            dp.put(n, dp.getOrDefault(n - d, 0) + 1);
            r = Math.max(r, dp.get(n));
        }
        return r;
    }
}