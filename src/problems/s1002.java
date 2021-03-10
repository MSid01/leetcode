package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Find Common Characters
 */
public class s1002 {
    public List<String> commonChars(String[] a) {
        int[] f = new int[26];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (String w : a) {
            int[] count = new int[26];
            for (char c : w.toCharArray())
                count[c - 'a']++;
            for (int i = 0; i < f.length; i++)
                f[i] = Math.min(f[i], count[i]);
        }
        List<String> r = new LinkedList<>();
        for (int i = 0; i < f.length; i++)
            while (f[i]-- > 0)
                r.add((char) (i + 'a') + "");
        return r;
    }
}
