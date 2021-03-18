package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Find Positive Integer Solution for a Given Equation
 */
public class s1237 {
    public List<List<Integer>> findSolution(CustomFunction f, int z) {
        List<List<Integer>> r = new LinkedList<>();
        for (int x = 1, y = 1000; x <= 1000 && y >= 1; ) {
            int z1 = f.f(x, y);
            if (z1 < z)
                x++;
            else if (z1 > z)
                y--;
            else r.add(Arrays.asList(x++, y--));
        }
        return r;
    }

    interface CustomFunction {
        int f(int x, int y);
    }
}