package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Parsing A Boolean Expression
 */
public class s1106 {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> s = new Stack<>();
        for (char c : expression.toCharArray())
            if (c == ')') {
                Set<Character> tf = new HashSet<>();
                while (s.peek() == 'f' || s.peek() == 't')
                    tf.add(s.pop());
                Character op = s.pop();
                if (op == '&')
                    s.push(tf.contains('f') ? 'f' : 't');
                else if (op == '|')
                    s.push(tf.contains('t') ? 't' : 'f');
                else s.push(tf.contains('t') ? 'f' : 't');
            } else if (c != '(' && c != ',')
                s.push(c);
        return s.pop() == 't';
    }
}