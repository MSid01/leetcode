package problems;

import java.util.Arrays;

/**
 * Redistribute Characters to Make All Strings Equal
 */
public class s1897 {
    public boolean makeEqual(String[] words) {
        int[] counts = new int[26];
        Arrays.stream(words).forEach(w -> w.chars().forEach(c -> counts[c - 'a']++));
        return Arrays.stream(counts).filter(c -> c % words.length != 0).findFirst().isEmpty();
    }
}