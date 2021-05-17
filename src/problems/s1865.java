package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Finding Pairs With a Certain Sum
 */
public class s1865 {
    class FindSumPairs {
        final Map<Integer, Integer> m = new HashMap<>();
        final int[] n1, n2;

        public FindSumPairs(int[] nums1, int[] nums2) {
            n1 = nums1;
            n2 = nums2;
            Arrays.stream(nums2).forEach(n -> m.put(n, m.getOrDefault(n, 0) + 1));
        }

        public void add(int i, int val) {
            m.put(n2[i], m.get(n2[i]) - 1);
            n2[i] += val;
            m.put(n2[i], m.getOrDefault(n2[i], 0) + 1);
        }

        public int count(int tot) {
            return Arrays.stream(n1).map(n -> m.getOrDefault(tot - n, 0)).sum();
        }
    }
}