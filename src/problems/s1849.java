package problems;

/**
 * Splitting a String Into Descending Consecutive Values
 */
public class s1849 {
    public boolean splitString(String s) { return canSplit(s, null);}

    boolean canSplit(String s, Double prev) {
        double n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = n * 10 + s.charAt(i) - '0';
            if (prev == null) {
                if (canSplit(s.substring(i + 1), n))
                    return true;
            } else if (n == prev - 1 && (i == s.length() - 1 || canSplit(s.substring(i + 1), n)))
                return true;
        }
        return false;
    }
}