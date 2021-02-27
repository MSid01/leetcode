package problems;

import java.util.LinkedList;

/**
 * Decompress Run-Length Encoded List
 */
public class s1313 {
    public int[] decompressRLElist(int[] a) {
        LinkedList<Integer> r = new LinkedList<>();
        for (int i = 0; i < a.length; i += 2)
            for (int f = a[i], v = a[i + 1]; f > 0; f--)
                r.add(v);
        return r.stream().mapToInt(i -> i).toArray();
    }
}
