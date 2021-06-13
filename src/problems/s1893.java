package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Check if All the Integers in a Range Are Covered
 */
public class s1893 {
    public boolean isCovered1(int[][] ranges, int L, int R) {
        Arrays.sort(ranges, Comparator.comparingInt(o -> o[0]));
        for (int[] r : ranges)
            if (r[0] <= L && L <= r[1])
                L = r[1] + 1;
        return L > R;
    }

    public boolean isCovered(int[][] ranges, int L, int R) {
        Set<Integer> s = IntStream.range(L, R + 1).boxed().collect(Collectors.toSet());
        Arrays.stream(ranges).forEach(r -> IntStream.range(r[0], r[1] + 1).forEach(s::remove));
        return s.isEmpty();
    }
}