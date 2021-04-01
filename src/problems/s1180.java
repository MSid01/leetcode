package problems;

/**
 * Count Substrings with Only One Distinct Letter
 */
public class s1180 {
    public int countLetters(String s) {
        int r = 1;
        for (int i = 1, count = 1; i < s.length(); i++, r += count)
            count = s.charAt(i - 1) == s.charAt(i) ? count + 1 : 1;
        return r;
    }
}
