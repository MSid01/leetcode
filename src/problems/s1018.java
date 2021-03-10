package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Prefix Divisible By 5
 */
public class s1018 {
    public List<Boolean> prefixesDivBy5(int[] a) {
        List<Boolean> r = new ArrayList<>(a.length);
        for (int i = 0, k = 0; i < a.length; i++) {
            k = (k << 1 | a[i]) % 5;
            r.add(k == 0);
        }
        return r;
    }
}
