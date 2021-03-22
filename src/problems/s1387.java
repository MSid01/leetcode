package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort Integers by The Power Value
 */
public class s1387 {
    public int getKth(int lo, int hi, int k) {
        int[] a = new int[hi - lo + 1], b = new int[hi + 1];
        for (int i = 0; i < a.length; i++) {
            b[lo] = powerValue(lo);
            a[i] = lo++;
        }
        List<Integer> list = Arrays.stream(a).boxed().sorted((n1, n2) -> b[n1] - b[n2] != 0 ? b[n1] - b[n2] : n1 - n2).collect(Collectors.toList());
        return list.get(k -1);
    }

    int powerValue(int n) {
        if (n == 1) return 0;
        return 1 + (n % 2 == 0 ? powerValue(n / 2) : powerValue(n * 3 + 1));
    }
}