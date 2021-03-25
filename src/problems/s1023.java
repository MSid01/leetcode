package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Camelcase Matching
 */
public class s1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> r = new ArrayList<>(queries.length);
        char[] p = pattern.toCharArray();
        for (String q : queries)
            r.add(match(q.toCharArray(), p));
        return r;
    }

    boolean match(char[] q, char[] p) {
        int j = 0;
        for (char c : q)
            if (j < p.length && c == p[j])
                j++;
            else if (Character.isUpperCase(c))
                return false;
        return j == p.length;
    }
}
