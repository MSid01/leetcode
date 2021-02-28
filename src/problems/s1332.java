package problems;

/**
 * Remove Palindromic Subsequences
 */
public class s1332 {
    public int removePalindromeSub(String s) {
        if (s.length() == 0)
            return 0;
        for (int lo = 0, hi = s.length() - 1; lo < hi; lo++, hi--)
            if (s.charAt(lo) != s.charAt(hi))
                return 2;
        return 1;
    }
}
