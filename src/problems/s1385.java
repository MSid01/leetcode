package problems;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Find the Distance Value Between Two Arrays
 */
public class s1385 {
    public int findTheDistanceValue(int[] a1, int[] a2, int d) {
        Arrays.sort(a2);
        int dv = 0;
        for (int a : a1) {
            int i = Arrays.binarySearch(a2, a);
            if (i < 0) {
                i = -i - 1;
                if ((i == 0 || a - a2[i - 1] > d) && (i == a2.length || a2[i] - a > d))
                    dv++;
            }
        }
        return dv;
    }

    public int findTheDistanceValue1(int[] a1, int[] a2, int d) {
        TreeSet<Integer> s = new TreeSet<>();
        Arrays.stream(a2).forEach(s::add);
        int r = 0;
        for (int a : a1) {
            Integer left = s.floor(a), right = s.ceiling(a);
            if ((left == null || a - left > d) && (right == null || right - a > d))
                r++;
        }
        return r;
    }
}
