package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Intersection of Three Sorted Arrays
 */
public class s1213 {
    public List<Integer> arraysIntersection(int[] a1, int[] a2, int[] a3) {
        List<Integer> r = new LinkedList<>();
        for (int i1 = 0, i2 = 0, i3 = 0; i1 < a1.length && i2 < a2.length && i3 < a3.length; )
            if (a1[i1] == a2[i2] && a2[i2] == a3[i3]) {
                r.add(a1[i1]);
                i1++;
                i2++;
                i3++;
            } else if (a1[i1] < a2[i2])
                i1++;
            else if (a2[i2] < a3[i3])
                i2++;
            else i3++;
        return r;
    }
}