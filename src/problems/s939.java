package problems;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Minimum Area Rectangle
 */
public class s939 {
    public int minAreaRect(int[][] p) {
        int minArea = Integer.MAX_VALUE, N = 40_001;
        Set<Integer> s = Arrays.stream(p).map(i -> i[0] * N + i[1]).collect(Collectors.toSet());
        for (int i = 0; i < p.length; i++)
            for (int j = i + 1; j < p.length; j++)
                if (p[i][0] != p[j][0] && p[i][1] != p[j][1] && s.contains(N * p[i][0] + p[j][1]) && s.contains(N * p[j][0] + p[i][1]))
                    minArea = Math.min(Math.abs(p[i][0] - p[j][0]) * Math.abs(p[i][1] - p[j][1]), minArea);
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}