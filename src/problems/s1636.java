package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Sort Array by Increasing Frequency
 */
public class s1636 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new s1636().frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int num : nums)
            f.put(num, f.getOrDefault(num, 0) + 1);
        return Arrays.stream(nums).boxed().sorted((o1, o2) -> f.get(o1) != f.get(o2) ? f.get(o1) - f.get(o2) : o2 - o1).mapToInt(n -> n).toArray();
    }
}
