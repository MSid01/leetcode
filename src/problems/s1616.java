package problems;

/**
 * Split Two Strings to Make Palindrome
 */
public class s1616 {
    public boolean checkPalindromeFormation(String a, String b) { return check(a, b) | check(b, a);}

    boolean palindrome(String s, int lo, int hi) {
        for (; lo < hi && s.charAt(lo) == s.charAt(hi); lo++, hi--) ;
        return lo >= hi;
    }

    boolean check(String a, String b) {
        int lo = 0, hi = a.length() - 1;
        for (; lo < hi && a.charAt(lo) == b.charAt(hi); lo++, hi--) ;
        return palindrome(a, lo, hi) | palindrome(b, lo, hi);
    }
}