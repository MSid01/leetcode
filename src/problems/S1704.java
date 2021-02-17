package problems;

import java.util.Set;

/**
 * Determine if String Halves Are Alike
 */
public class S1704 {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int c1 = 0, c2 = 0, halfIdx = s.length() / 2;
        for (int i = 0; i < halfIdx; i++) {
            if (vowels.contains(s.charAt(i)))
                c1++;
            if (vowels.contains(s.charAt(i + halfIdx)))
                c2++;
        }
        return c1 == c2;
    }
}
