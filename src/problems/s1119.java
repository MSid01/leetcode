package problems;

import java.util.Set;

/**
 * Remove Vowels from a String
 */
public class s1119 {
    public String removeVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (!vowels.contains(s.charAt(i)))
                r.append(s.charAt(i));
        return r.toString();
    }
}
