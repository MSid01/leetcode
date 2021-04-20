package problems;

import java.util.Arrays;

/**
 * Determine if Two Strings Are Close
 */
public class s1657 {
    public boolean closeStrings(String w1, String w2) {
        if (w1.length() != w2.length())
            return false;
        int[] c1 = new int[26], c2 = new int[26];
        for (int i = 0; i < w1.length(); i++) {
            c1[w1.charAt(i) - 'a']++;
            c2[w2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < c1.length; i++)
            if (c1[i] * c2[i] == 0 && (c1[i] != 0 || c2[i] != 0))
                return false;
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}