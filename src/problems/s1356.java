package problems;

import java.util.Arrays;

/**
 * Sort Integers by The Number of 1 Bits
 */
public class s1356 {
    public int[] sortByBits(int[] a) {
        return Arrays.stream(a).boxed().sorted((o1, o2) -> {
            int diff = Integer.bitCount(o1) - Integer.bitCount(o2);
            return diff != 0 ? diff : o1 - o2;
        }).mapToInt(i -> i).toArray();
    }
}
