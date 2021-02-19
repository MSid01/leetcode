package problems;

/**
 * Maximum Repeating Substring
 */
public class s1668 {
    public int maxRepeating(String s, String w) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i, times = 0;
            while (s.startsWith(w, j)) {
                times++;
                max = Math.max(max, times);
                j += w.length();
            }
            max = Math.max(max, times);
        }
        return max;
    }
}
