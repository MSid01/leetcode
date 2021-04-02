package problems;

import java.util.Arrays;

/**
 * How Many Apples Can You Put into the Basket
 */
public class s1196 {
    public int maxNumberOfApples(int[] a) {
        Arrays.sort(a);
        int count = 0, sum = 0;
        for (int i = 0; i < a.length && sum <= 5_000; i++, count++)
            sum += a[i];
        return count - (sum <= 5_000 ? 0 : 1);
    }
}
