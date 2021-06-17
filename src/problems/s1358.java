package problems;

/**
 * Number of Substrings Containing All Three Characters
 */
public class s1358 {
    public int numberOfSubstrings(String s) {
        int r = 0, a[] = new int[3];
        for (int j = 0, i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            while (a[0] * a[1] * a[2] > 0) {
                a[s.charAt(j++) - 'a']--;
                r += s.length() - i;
            }
        }
        return r;
    }
}