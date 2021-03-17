package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Add to Array-Form of Integer
 */
public class s989 {
    public List<Integer> addToArrayForm(int[] a, int k) {
        LinkedList<Integer> r = new LinkedList<>();
        for (int i = a.length - 1; i >= 0; i--) {
            r.addFirst((a[i] + k) % 10);
            k = (a[i] + k) / 10;
        }
        while (k > 0) {
            r.addFirst(k % 10);
            k /= 10;
        }
        return r;
    }
}