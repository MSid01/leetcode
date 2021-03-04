package problems;

/**
 * Consecutive Characters
 */
public class s1446 {
    public int maxPower(String s) {
        int max = 1;
        for (int i = 0; i < s.length(); ) {
            int count = 1, j = i + 1;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                count++;
                max = Math.max(max, count);
                j++;
            }
            i = j;
        }
        return max;
    }
}
