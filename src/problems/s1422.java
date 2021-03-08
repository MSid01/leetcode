package problems;

/**
 * Maximum Score After Splitting a String
 */
public class s1422 {
    public int maxScore(String s) {
        int ones = 0, max = Integer.MIN_VALUE;
        for (int i = 0, zeroLeft = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                zeroLeft++;
            else ones++;
            if (i < s.length() - 1)
                max = Math.max(max, zeroLeft - ones);
        }
        return max + ones;
    }
}
