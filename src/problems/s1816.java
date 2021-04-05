package problems;

import java.util.Arrays;

/**
 * Truncate Sentence
 */
public class s1816 {
    public String truncateSentence1(String s, int k) {
        int i = 0;
        for (; i < s.length() && k > 0; i++)
            if (s.charAt(i) == ' ')
                k--;
        return i == s.length() ? s : s.substring(0, i - 1);
    }

    public String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }
}