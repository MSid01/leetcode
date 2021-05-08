package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Longest String Chain
 */
public class s1048 {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> dp = new HashMap<>();
        int longest = 0;
        for (String w : words) {
            int max = 0;
            for (int i = 0; i < w.length(); i++)
                max = Math.max(max, dp.getOrDefault(w.substring(0, i) + w.substring(i + 1), 0) + 1);
            dp.put(w, max);
            longest = Math.max(longest, max);
        }
        return longest;
    }
}