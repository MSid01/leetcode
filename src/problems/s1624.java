package problems;

/**
 * Largest Substring Between Two Equal Characters
 */
public class s1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int m[] = new int[26], max = -1;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (m[idx] > 0)
                max = Math.max(max, i - m[idx]);
            else m[idx] = i + 1;
        }
        return max;
    }
}
