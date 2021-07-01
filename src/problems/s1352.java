package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Product of the Last K Numbers
 */
public class s1352 {
    class ProductOfNumbers {
        final List<Integer> a = new ArrayList<>();

        ProductOfNumbers() { a.add(1);}

        public void add(int n) {
            if (n == 0) {
                a.clear();
                a.add(1);
            } else a.add(a.get(a.size() - 1) * n);
        }

        public int getProduct(int k) {
            int n = a.size();
            return k < n ? a.get(n - 1) / a.get(n - k - 1) : 0;
        }
    }
}