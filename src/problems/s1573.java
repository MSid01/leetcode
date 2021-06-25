package problems;

/**
 * Number of Ways to Split a String
 */
public class s1573 {
    public int numWays(String s) {
        int ones = 0, n = s.length(), M = 1_000_000_007;
        for (int i = 0; i < n; i++)
            ones += s.charAt(i) - '0';
        if (ones % 3 != 0)
            return 0;
        if (ones == 0)
            return (int) ((n - 1L) * (n - 2L) / 2 % M);
        int len = ones / 3, firstCut = 0, secondCut = 0, count = 0;
        for (int i = 0; count <= len * 2; i++) {
            count += s.charAt(i) - '0';
            firstCut += count == len ? 1 : 0;
            secondCut += count == len * 2 ? 1 : 0;
        }
        return (int) ((long) firstCut * secondCut % M);
    }
}