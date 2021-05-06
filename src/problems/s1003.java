package problems;

import java.util.Stack;

/**
 * Check If Word Is Valid After Substitutions
 */
public class s1003 {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'c') {
                if (s.isEmpty() || s.pop() != 'b')
                    return false;
                if (s.isEmpty() || s.pop() != 'a')
                    return false;
            } else s.push(c);
        }
        return s.isEmpty();
    }
}