package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Target Array in the Given Order
 */
public class s1389 {
    public int[] createTargetArray(int[] a, int[] index) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            r.add(index[i], a[i]);
        return r.stream().mapToInt(i -> i).toArray();
    }
}
