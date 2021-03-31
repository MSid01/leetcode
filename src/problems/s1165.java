package problems;

/**
 * Single-Row Keyboard
 */
public class s1165 {
    public int calculateTime(String keyboard, String word) {
        int m[] = new int[26], r = 0;
        for (int i = 0; i < keyboard.length(); i++)
            m[keyboard.charAt(i) - 'a'] = i;
        for (int i = 0, p = 0, nextP; i < word.length(); i++, p = nextP) {
            nextP = m[word.charAt(i) - 'a'];
            r += Math.abs(nextP - p);
        }
        return r;
    }
}
