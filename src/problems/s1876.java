package problems;

/**
 * Substrings of Size Three with Distinct Characters
 */
public class s1876 {
    public int countGoodSubstrings(String s) {
        int r = 0;
        for (int i = 2; i < s.length(); i++)
            if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i - 1) != s.charAt(i - 2) && s.charAt(i) != s.charAt(i - 2))
                r++;
        return r;
    }
}