package problems;

import java.util.Arrays;

/**
 * Moving Stones Until Consecutive
 */
public class s1033 {
    public int[] numMovesStones(int a, int b, int c) {
        int arr[] = {a, b, c}, min = 2;
        Arrays.sort(arr);
        int a1 = arr[0], a2 = arr[1], a3 = arr[2];
        if (a3 - a1 == 2)
            min = 0;
        else if (a2 - a1 <= 2 || a3 - a2 <= 2)
            min = 1;
        return new int[]{min, a3 - a1 - 2};
    }
}