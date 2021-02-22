package problems;

/**
 * Merge Strings Alternately
 */
public class s1768 {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < w1.length() || i < w2.length(); i++) {
            if (i < w1.length())
                r.append(w1.charAt(i));
            if (i < w2.length())
                r.append(w2.charAt(i));
        }
        return r.toString();
    }
}
