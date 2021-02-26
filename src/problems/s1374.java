package problems;

import java.util.Arrays;

/**
 * Generate a String With Characters That Have Odd Counts
 */
public class s1374 {
    public String generateTheString(int n) {
        char[] a = new char[n];
        Arrays.fill(a, 'a');
        if (n % 2 == 0)
            a[0] = 'b';
        return new String(a);
    }
}
