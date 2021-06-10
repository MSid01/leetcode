package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Minimum Deletions to Make Character Frequencies Unique
 */
public class s1647 {
    public int minDeletions(String s) {
        int counts[] = new int[26], r = 0;
        s.chars().forEach(c -> counts[c - 'a']++);
        Set<Integer> used = new HashSet<>();
        for (int count : counts)
            for (; count > 0 && !used.add(count); count--, r++);
        return r;
    }
}