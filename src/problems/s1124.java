package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Well-Performing Interval
 */
public class s1124 {
    public int longestWPI(int[] hours) {
        int r = 0, score = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < hours.length; i++) {
            score += hours[i] > 8 ? 1 : -1;
            if (score > 0)
                r = i + 1;
            else {
                m.putIfAbsent(score, i);
                if (m.containsKey(score - 1))
                    r = Math.max(r, i - m.get(score - 1));
            }
        }
        return r;
    }
}