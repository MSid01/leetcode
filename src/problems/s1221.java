package problems;

/**
 * Split a String in Balanced Strings
 */
public class s1221 {
    public int balancedStringSplit(String s) {
        int count = 0, open = 0;
        for (int i = 0; i < s.length(); i++) {
            open += s.charAt(i) == 'L' ? -1 : 1;
            if (open == 0)
                count++;
        }
        return count;
    }
}
