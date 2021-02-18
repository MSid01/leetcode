package problems;

import java.util.Arrays;

/**
 * Count the Number of Consistent Strings
 */
public class s1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] a = new boolean[26];
        for (char c : allowed.toCharArray())
            a[c - 'a'] = true;
        return (int) Arrays.stream(words).filter(w -> consistent(w, a)).count();
    }

    boolean consistent(String w, boolean[] allowed) {
        for (char c : w.toCharArray())
            if (!allowed[c - 'a'])
                return false;
        return true;
    }
}
