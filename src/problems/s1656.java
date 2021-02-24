package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Design an Ordered Stream
 */
public class s1656 {
    class OrderedStream {
        String[] a;
        int pr = 0;

        public OrderedStream(int n) {
            a = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            List<String> r = new LinkedList<>();
            a[idKey - 1] = value;
            while (pr < a.length && a[pr] != null)
                r.add(a[pr++]);
            return r;
        }
    }
}
