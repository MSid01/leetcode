package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Pancake Sorting
 */
public class s969 {
    public List<Integer> pancakeSort(int[] a) {
        List<Integer> r = new ArrayList<>(a.length * 2);
        for (int e = a.length, i; e > 0; e--) {
            for (i = 1; a[i - 1] != e; i++) ;
            r.add(flip(a, i));
            r.add(flip(a, e));
        }
        return r;
    }

    Integer flip(int[] a, int n) {
        for (int lo = 0, hi = n - 1; lo < hi; lo++, hi--) {
            int t = a[lo];
            a[lo] = a[hi];
            a[hi] = t;
        }
        return n;
    }
}