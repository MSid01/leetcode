package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Count Largest Group
 */
public class s1399 {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxCount = 0;
        for (int i = 1, num = i, sum = 0; i <= n; i++, num = i, sum = 0) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            count.put(sum, count.getOrDefault(sum, 0) + 1);
            maxCount = Math.max(count.get(sum), maxCount);
        }
        int finalMaxCount = maxCount;
        return (int) count.values().stream().filter(v -> v == finalMaxCount).count();
    }
}
