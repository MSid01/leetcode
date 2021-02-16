package s1711;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countPairs(int[] d) {
        Map<Integer, Integer> m = new HashMap<>();
        long r = 0, N = (long) Math.pow(2, 22);
        for (int a : d) {
            for (int i = 1; i < N; i *= 2)
                if (m.containsKey(i - a))
                    r = (r + m.get(i - a)) % 1_000_000_007;
            m.put(a, m.getOrDefault(a, 0) + 1);
        }
        return (int) r;
    }
}