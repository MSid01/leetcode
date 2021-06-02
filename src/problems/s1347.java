package problems;

import java.util.Arrays;

/**
 * Minimum Number of Steps to Make Two Strings Anagram
 */
public class s1347 {
    public int minSteps(String s, String t) {
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }
        return Arrays.stream(c).filter(i -> i > 0).sum();
    }
}