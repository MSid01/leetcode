package problems;

import java.util.Arrays;

/**
 * Height Checker
 */
public class s1051 {
    public int heightChecker(int[] heights) {
        int sorted[] = Arrays.stream(heights).sorted().toArray(), r = 0;
        for (int i = 0; i < heights.length; i++)
            if (heights[i] != sorted[i])
                r++;
        return r;
    }
}
