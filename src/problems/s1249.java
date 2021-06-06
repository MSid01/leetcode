package problems;

import java.util.Stack;

/**
 * Minimum Remove to Make Valid Parentheses
 */
public class s1249 {
    public String minRemoveToMakeValid(String str) {
        char[] a = str.toCharArray();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < str.length(); i++)
            if (a[i] == '(')
                s.push(i);
            else if (a[i] == ')') {
                if (!s.isEmpty())
                    s.pop();
                else a[i] = '*';
            }
        while (!s.isEmpty())
            a[s.pop()] = '*';
        StringBuilder r = new StringBuilder(a.length);
        for (char c : a)
            if (c != '*')
                r.append(c);
        return r.toString();
    }
}