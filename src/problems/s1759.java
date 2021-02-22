package problems;

/**
 * Count Number of Homogenous Substrings
 */
public class s1759 {
    public int countHomogenous(String s) {
        int r = 0, prev = 0;
        for (int i = 0, f = 0; i < s.length(); i++) {
            f = s.charAt(i) == prev ? f + 1 : 1;
            prev = s.charAt(i);
            r = (r + f) % 1_000_000_007;
        }
        return r;
    }
}
