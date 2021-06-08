package problems;

/**
 * Bulb Switcher IV
 */
public class s1529 {
    public int minFlips(String t) {
        int r = 0, state = 0;
        for (char c : t.toCharArray())
            if (c - '0' != state) {
                r++;
                state = c - '0';
            }
        return r;
    }
}