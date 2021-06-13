package problems;

import java.util.Arrays;

/**
 * Pairs of Songs With Total Durations Divisible by 60
 */
public class s1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] c = new int[60];
        Arrays.stream(time).forEach(t -> c[t % 60]++);
        int r = c[30] * (c[30] - 1) / 2 + c[0] * (c[0] - 1) / 2;
        for (int i = 1; i < 30; i++)
            r += c[i] * c[60 - i];
        return r;
    }
}