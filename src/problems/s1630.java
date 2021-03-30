package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Arithmetic Subarrays
 */
public class s1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] a, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>(r.length);
        for (int i = 0; i < r.length; i++) {
            int[] b = Arrays.copyOfRange(a, l[i], r[i] + 1);
            Arrays.sort(b);
            boolean check = true;
            for (int j = 2; j < b.length; j++)
                if (b[j - 1] - b[j - 2] != b[j] - b[j - 1]) {
                    check = false;
                    break;
                }
            res.add(check);
        }
        return res;
    }
}
