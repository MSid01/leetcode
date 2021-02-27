package problems;

/**
 * Decrypt String from Alphabet to Integer Mapping
 */
public class s1309 {
    public String freqAlphabets(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) == '#') {
                r.append((char) ('a' + Integer.parseInt(s.substring(i - 2, i)) - 1));
                i -= 2;
            } else r.append((char) ('a' + Character.getNumericValue(s.charAt(i)) - 1));
        return r.reverse().toString();
    }
}
