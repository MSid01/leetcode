package problems;

import java.util.Arrays;

/**
 * The k Strongest Values in an Array
 */
public class s1471 {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int m = arr[(arr.length - 1) / 2], r[] = new int[k];
        return Arrays.stream(arr).boxed().sorted((a, b) -> Math.abs(a - m) != Math.abs(b - m) ? Math.abs(b - m) - Math.abs(a - m) : b - a).limit(k).mapToInt(i -> i).toArray();
    }
}
