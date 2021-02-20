package problems;

/**
 * Replace All ?'s to Avoid Consecutive Repeating Characters
 */
public class s1576 {
    public String modifyString(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++)
            if (a[i] == '?') {
                char prev = i > 0 ? a[i - 1] : '?', next = i < a.length - 1 ? a[i + 1] : '?';
                for (char c = 'a'; c <= 'z'; c++)
                    if (c != prev && c != next) {
                        a[i] = c;
                        break;
                    }
            }
        return new String(a);
    }
}
