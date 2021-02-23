package problems;

/**
 * Thousand Separator
 */
public class s1556 {
    public String thousandSeparator(int n) {
        StringBuilder r = new StringBuilder(String.valueOf(n));
        for (int i = r.length() - 1, count = 1; i > 0; count++, i--)
            if (count == 3) {
                count = 1;
                r.insert(i, '.');
                i--;
            }
        return r.toString();
    }
}
