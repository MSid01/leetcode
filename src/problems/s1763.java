package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Nice Substring
 */
public class s1763 {
    public String longestNiceSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        char[] a = s.toCharArray();
        for (char c : a)
            chars.add(c);
        for (int i = 0; i < s.length(); i++)
            if (!chars.contains(Character.toLowerCase(s.charAt(i))) || !chars.contains(Character.toUpperCase(s.charAt(i)))) {
                String s1 = longestNiceSubstring(s.substring(0, i)), s2 = longestNiceSubstring(s.substring(i + 1));
                return s1.length() >= s2.length() ? s1 : s2;
            }
        return s;
    }
}