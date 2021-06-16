package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Cinema Seat Allocation
 */
public class s1386 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int[] s : reservedSeats)
            m.put(s[0], m.getOrDefault(s[0], 0) | (1 << (s[1] - 1)));
        int r = 0;
        for (int row : m.keySet()) {
            int s = m.get(row), count = ((s & 0b11110) == 0 ? 1 : 0) + ((s & 0b111100000) == 0 ? 1 : 0);
            r += count == 0 && ((s & 0b1111000) == 0) ? 1 : count;
        }
        return r + 2 * (n - m.size());
    }
}