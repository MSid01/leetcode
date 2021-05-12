package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Of All Vowels in Order
 */
public class s1839 {
    public int longestBeautifulSubstring(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int maxLen = 0, idx = 0, nextIdx = 0, currLen = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == vowels[idx]) {
                currLen++;
                nextIdx = idx + 1;
                if (idx == vowels.length - 1)
                    maxLen = Math.max(maxLen, currLen);
            } else if (nextIdx < vowels.length && c == vowels[nextIdx]) {
                currLen++;
                idx = nextIdx;
                nextIdx = idx + 1;
                if (idx == vowels.length - 1)
                    maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = c == 'a' ? 1 : 0;
                idx = 0;
                nextIdx = c == 'a' ? 1 : 0;
            }
        }
        return maxLen;
    }

    public int longestBeautifulSubstring1(String word) {
        int maxLen = 0;
        Set<Character> seen = new HashSet<>();
        for (int lo = -1, hi = 0; hi < word.length(); hi++) {
            if (hi > 0 && word.charAt(hi - 1) > word.charAt(hi)) {
                seen = new HashSet<>();
                lo = hi - 1;
            }
            seen.add(word.charAt(hi));
            if (seen.size() == 5)
                maxLen = Math.max(maxLen, hi - lo);
        }
        return maxLen;
    }
}