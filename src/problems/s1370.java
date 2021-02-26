package problems;

/**
 * Increasing Decreasing String
 */
public class s1370 {
    public String sortString(String s) {
        int counts[] = new int[26], len = 0;
        for (char c : s.toCharArray())
            counts[c - 'a']++;
        StringBuilder r = new StringBuilder(s.length());
        while (len < s.length()) {
            for (int i = 0; i < counts.length; i++)
                if (counts[i]-- > 0) {
                    r.append((char) (i + 'a'));
                    len++;
                }
            for (int i = counts.length - 1; i >= 0; i--)
                if (counts[i]-- > 0) {
                    r.append((char) (i + 'a'));
                    len++;
                }
        }
        return r.toString();
    }
}
