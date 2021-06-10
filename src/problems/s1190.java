package problems;

import java.util.Stack;

/**
 * Reverse Substrings Between Each Pair of Parentheses
 */
public class s1190 {
    public String reverseParentheses(String str) {
        Stack<StringBuilder> s = new Stack<>();
        s.push(new StringBuilder());
        for (char c : str.toCharArray())
            if (c == '(')
                s.push(new StringBuilder());
            else if (c == ')') {
                StringBuilder b = s.pop();
                s.peek().append(b.reverse());
            } else s.peek().append(c);
        return s.peek().toString();
    }
}