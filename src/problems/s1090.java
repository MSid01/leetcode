package problems;

import java.util.Arrays;

/**
 * Largest Values From Labels
 */
public class s1090 {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        int items[][] = new int[values.length][2], used[] = new int[20_001], r = 0;
        for (int i = 0; i < values.length; i++)
            items[i] = new int[]{values[i], labels[i]};
        Arrays.sort(items, (o1, o2) -> o2[0] - o1[0]);
        for (int i = 0; i < items.length && num_wanted > 0; i++)
            if (++used[items[i][1]] <= use_limit) {
                r += items[i][0];
                num_wanted--;
            }
        return r;
    }
}