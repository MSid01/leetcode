package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print Words Vertically
 */
public class s1324 {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int len = Arrays.stream(words).mapToInt(String::length).max().getAsInt();
        List<String> r = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            StringBuilder b = new StringBuilder(words.length);
            for (String w : words)
                b.append(i < w.length() ? w.charAt(i) : " ");
            r.add(b.toString().stripTrailing());
        }
        return r;
    }
}