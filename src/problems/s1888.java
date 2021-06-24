package problems;

/**
 * Minimum Number of Flips to Make the Binary String Alternating
 */
public class s1888 {
    public int minFlips(String s) {
        int r = Integer.MAX_VALUE;
        for (int i = 0, wrong = 0; i < 2 * s.length(); i++) {
            int j = i % s.length();
            if ((s.charAt(j) - '0') != (i % 2 == 0 ? 1 : 0))
                wrong++;
            if (i >= s.length() && (s.charAt(j) - '0') != (j % 2 == 0 ? 1 : 0))
                wrong--;
            if (i >= s.length() - 1)
                r = Math.min(r, Math.min(wrong, s.length() - wrong));
        }
        return r;
    }
}