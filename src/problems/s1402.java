package problems;

import java.util.Arrays;

/**
 * Reducing Dishes
 */
public class s1402 {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int r = 0, sum = 0, c = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            sum += s[i];
            c += sum;
            r = Math.max(r, c);
        }
        return r;
    }
}