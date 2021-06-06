package problems;

/**
 * Minimum Insertions to Balance a Parentheses String
 */
public class s1541 {
    public int minInsertions1(String s) {
        int open = 0, r = 0, n = s.length();
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == ')') {
                if (i + 1 < n && s.charAt(i + 1) == ')')
                    i++;
                else r++;
                if (open == 0)
                    r++;
                else open--;
            } else open++;
        return r + 2 * open;
    }

    public int minInsertions(String s) {
        int r = 0, close = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') {
                if (close % 2 > 0) {
                    close--;
                    r++;
                }
                close += 2;
            } else if (--close < 0) {
                r++;
                close += 2;
            }
        return r + close;
    }
}