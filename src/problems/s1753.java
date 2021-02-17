package problems;

import java.util.Arrays;

/**
 * Maximum Score From Removing Stones
 */
public class s1753 {
    public int maximumScore(int a, int b, int c) {
        return maxScore(new int[]{a, b, c});
    }

    int maxScore(int[] n) {
        Arrays.sort(n);
        if (n[0] == 0) return Math.min(n[1], n[2]);
        n[0] = n[0] - 1;
        n[2] = n[2] - 1;
        return 1 + maxScore(n);
    }
}
