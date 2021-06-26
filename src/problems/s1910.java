package problems;

/**
 * Remove All Occurrences of a Substring
 */
public class s1910 {
    public String removeOccurrences(String s, String p) {
        return s.contains(p) ? removeOccurrences(s.replaceAll(p, ""), p) : s;
    }
}