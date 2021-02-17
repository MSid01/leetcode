package problems;

/**
 * Reformat Phone Number
 */
public class s1694 {
    public String reformatNumber(String n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c != ' ' && c != '-')
                s.append(c);
        }
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i += 3) {
            int digitsLeft = s.length() - i;
            if (digitsLeft <= 1) break;
            if (digitsLeft == 2 || digitsLeft == 3)
                r.append(s.substring(i));
            else if (digitsLeft == 4) {
                r.append(s.substring(i, i + 2)).append("-").append(s.substring(i + 2, i + 4));
            } else r.append(s.substring(i, i + 3)).append('-');
        }
        return r.toString();
    }
}
