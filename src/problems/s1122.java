package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Relative Sort Array
 */
public class s1122 {
    public int[] relativeSortArray(int[] a1, int[] a2) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a2.length; i++)
            m.put(a2[i], i);
        return Arrays.stream(a1).boxed().sorted(Comparator.comparingInt(o -> m.getOrDefault(o, 1_000 + o))).mapToInt(i -> i).toArray();
    }

    public int[] relativeSortArray1(int[] a1, int[] a2) {
        int f[] = new int[1001], i = 0;
        for (int a : a1)
            f[a]++;
        for (int a : a2)
            while (f[a]-- > 0)
                a1[i++] = a;
        for (int k = 0; k < f.length; k++)
            while (f[k]-- > 0)
                a1[i++] = k;
        return a1;
    }
}
