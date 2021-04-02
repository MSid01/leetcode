package problems;

/**
 * Hexspeak
 */
public class s1271 {
    public String toHexspeak(String num) {
        String s = Long.toHexString(Long.parseLong(num));
        StringBuilder r = new StringBuilder(s.length());
        for (char c : s.toCharArray())
            if (c == '0')
                r.append('O');
            else if (c == '1')
                r.append('I');
            else if ('a' <= c && c <= 'f')
                r.append(Character.toUpperCase(c));
            else return "ERROR";
        return r.toString();
    }
}