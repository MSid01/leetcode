package problems;

/**
 * Make The String Great
 */
public class s1544 {
    public String makeGood(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        for (int j = 0; j < s.length(); j++, i++) {
            a[i] = a[j];
            if (i > 0 && a[i - 1] != a[i] && Character.toLowerCase(a[i - 1]) == Character.toLowerCase(a[i]))
                i -= 2;
        }
        return new String(a, 0, i);
    }
}
