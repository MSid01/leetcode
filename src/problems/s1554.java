package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Strings Differ by One Character
 */
public class s1554 {
    public boolean differByOne(String[] words) {
        for (int i = 0; i < words[0].length(); i++) {
            Set<String> s = new HashSet<>();
            for (String w : words)
                if (!s.add(w.substring(0, i) + w.substring(i + 1)))
                    return true;
        }
        return false;
    }
}