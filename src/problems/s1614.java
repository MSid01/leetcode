package problems;

/**
 * Maximum Nesting Depth of the Parentheses
 */
public class s1614 {
    public int maxDepth(String s) {
        int max = 0, open = 0;
        for (char c : s.toCharArray())
            if (c == '(')
                max = Math.max(max, ++open);
            else if (c == ')')
                open--;
        return max;
    }
}