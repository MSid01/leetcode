package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Satisfiability of Equality Equations
 */
public class s990 {
    public boolean equationsPossible(String[] eqs) {
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int i = 0; i < 26; i++)
            g.put(i, new HashSet<>());
        for (String eq : eqs)
            if (eq.charAt(1) == '=') {
                int a = eq.charAt(0) - 'a', b = eq.charAt(3) - 'a';
                g.get(a).add(b);
                g.get(b).add(a);
            }
        for (String eq : eqs)
            if (eq.charAt(1) == '!' && notPossible(eq.charAt(0) - 'a', eq.charAt(3) - 'a', g, new boolean[26]))
                return false;
        return true;
    }

    boolean notPossible(int a, int t, Map<Integer, Set<Integer>> g, boolean[] seen) {
        if (g.get(a).contains(t) || a == t)
            return true;
        seen[a] = true;
        for (Integer b : g.get(a))
            if (!seen[b] && notPossible(b, t, g, seen))
                return true;
        return false;
    }
}
