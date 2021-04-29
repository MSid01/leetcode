package problems;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Brace Expansion
 */
public class s1087 {
    public String[] expand(String s) {
        TreeSet<String> r = new TreeSet<>();
        expand("", s, r);
        return r.toArray(new String[0]);
    }

    void expand(String pre, String s, TreeSet<String> r) {
        int start = s.indexOf("{"), end = s.indexOf("}", start);
        if (start < end) {
            final String prefix = pre + s.substring(0, start), post = s.substring(end + 1);
            Arrays.stream(s.substring(start + 1, end).split(",")).forEach(p -> expand(prefix + p, post, r));
        } else r.add(pre + s);
    }
}