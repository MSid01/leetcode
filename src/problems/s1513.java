package problems;

/**
 * Number of Substrings With Only 1s
 */
public class s1513 {
    public int numSub(String s) {
        int r = 0;
        for (int i = 0, curr = 1; i < s.length(); i++)
            if (s.charAt(i) == '0')
                curr = 1;
            else r = (r + curr++) % 1_000_000_007;
        return r;
    }
}