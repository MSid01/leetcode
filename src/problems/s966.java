package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Vowel Spellchecker
 */
public class s966 {
    public String[] spellchecker(String[] words, String[] qs) {
        Set<String> wordSet = new HashSet<>();
        HashMap<String, String> m1 = new HashMap<>(), m2 = new HashMap<>();
        for (String w : words) {
            m1.putIfAbsent(w.toLowerCase(), w);
            m2.putIfAbsent(w.toLowerCase().replaceAll("[aeiou]", "a"), w);
            wordSet.add(w);
        }
        for (int i = 0; i < qs.length; i++)
            if (!wordSet.contains(qs[i])) {
                String lower = qs[i].toLowerCase(), noVowels = lower.replaceAll("[aeiou]", "a");
                qs[i] = m1.getOrDefault(lower, m2.getOrDefault(noVowels, ""));
            }
        return qs;
    }
}