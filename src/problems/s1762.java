package problems;

import java.util.LinkedList;

/**
 * Buildings With an Ocean View
 */
public class s1762 {
    public int[] findBuildings(int[] a) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = a.length - 1, max = 0; i >= 0; i--)
            if (a[i] > max) {
                list.addFirst(i);
                max = a[i];
            }
        return list.stream().mapToInt(i -> i).toArray();
    }
}