package problems;

/**
 * Remove Outermost Parentheses
 */
public class s1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = 0, open = 0, start = 0; i < s.length(); i++) {
            open += s.charAt(i) == '(' ? 1 : -1;
            if (open == 0) {
                r.append(s, start + 1, i);
                start = i + 1;
            }
        }
        return r.toString();
    }
}
