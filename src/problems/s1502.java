package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Can Make Arithmetic Progression From Sequence
 */
public class s1502 {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        for (int i = 2, diff = a[1] - a[0]; i < a.length; i++)
            if (a[i] - a[i - 1] != diff)
                return false;
        return true;
    }

    public boolean canMakeArithmeticProgression1(int[] a) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<Integer> s = new HashSet<>();
        for (int i : a) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            s.add(i);
        }
        int d = max - min;
        if (d == 0) return true;
        if (d % (a.length - 1) != 0) return false;
        d /= (a.length - 1);
        for (int i = min; i <= max; i += d)
            if (!s.contains(i))
                return false;
        return true;
    }
}
