package problems;

/**
 * Minimum Changes To Make Alternating Binary String
 */
public class s1758 {
    public int minOperations(String s) {
        int zeroStart = 0, oneStart = 0;
        char c = '0';
        for (char ch : s.toCharArray()) {
            if (ch != c)
                zeroStart++;
            else oneStart++;
            c = c == '0' ? '1' : '0';
        }
        return Math.min(zeroStart, oneStart);
    }
}
