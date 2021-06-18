package problems;

import java.util.*;

/**
 * Lexicographically Smallest String After Applying Operations
 */
public class s1625 {
    public String findLexSmallestString(String s, int a, int b) {
        String min = s;
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        Set<String> seen = new HashSet<>(q);
        while (!q.isEmpty()) {
            min = (s = q.poll()).compareTo(min) < 0 ? s : min;
            Arrays.stream(new String[]{op1(s.toCharArray(), a), op2(s, b)}).filter(seen::add).forEach(q::offer);
        }
        return min;
    }

    String op1(char[] s, int a) {
        for (int i = 1; i < s.length; i += 2)
            s[i] = Character.forDigit((s[i] - '0' + a) % 10, 10);
        return new String(s);
    }

    String op2(String s, int b) {return s.substring(s.length() - b) + s.substring(0, s.length() - b);}
}