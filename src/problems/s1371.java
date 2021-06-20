package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the Longest Substring Containing Vowels in Even Counts
 */
public class s1371 {
    public int findTheLongestSubstring(String s) {
        int r = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        for (int i = 0, p = 0; i < s.length(); i++) {
            int j = "aeiou".indexOf(s.charAt(i));
            if (j >= 0)
                m.putIfAbsent(p ^= 1 << j, i);
            r = Math.max(r, i - m.get(p));
        }
        return r;
    }
}