package problems;

/**
 * Remove All Adjacent Duplicates In String
 */
public class s1047 {
    public String removeDuplicates(String s) {
        int i = 0;
        char[] a = s.toCharArray();
        for (int j = 0; j < s.length(); j++, i++) {
            a[i] = a[j];
            if (i > 0 && a[i - 1] == a[i])
                i -= 2;
        }
        return new String(a, 0, i);
    }
}
