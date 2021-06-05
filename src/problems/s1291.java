package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sequential Digits
 */
public class s1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        Set<Integer> r = new TreeSet<>();
        for (int d = 1; d < 9; d++)
            for (int next = d, n = d; n <= high && next < 10; n = n * 10 + ++next)
                if (n >= low)
                    r.add(n);
        return new ArrayList<>(r);
    }
}