package problems;

/**
 * Greatest Common Divisor of Strings
 */
public class s1071 {
    public String gcdOfStrings(String s1, String s2) {
        if (s1.length() > s2.length())
            return gcdOfStrings(s2, s1);
        if (divides(s1, s2))
            return s1;
        for (int len = s1.length() / 2; len >= 1; len--) {
            if (s1.length() % len == 0) {
                String s = s1.substring(0, len);
                if(divides(s, s1) && divides(s, s2))
                    return s;
            }
        }
        return "";
    }

    boolean divides(String t, String s) {
        int i = 0;
        while (s.startsWith(t, i))
            i += t.length();
        return i == s.length();
    }
}