package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Array Transformation
 */
public class s1243 {
    public List<Integer> transformArray(int[] a) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 1, prev = a[0]; i < a.length - 1; i++) {
                int t = a[i];
                if (prev > a[i] && a[i] < a[i + 1])
                    a[i]++;
                else if (prev < a[i] && a[i] > a[i + 1])
                    a[i]--;
                if (a[i] != t)
                    changed = true;
                prev = t;
            }
        }
        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }
}