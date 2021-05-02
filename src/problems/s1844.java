package problems;

/**
 * Replace All Digits with Characters
 */
public class s1844 {
    public String replaceDigits(String s) {
        char[] a = s.toCharArray();
        for (int i = 1; i < a.length; i += 2)
            a[i] = (char) (a[i - 1] + a[i] - '0');
        return new String(a);
    }
}