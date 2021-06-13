package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Powerful Integers
 */
public class s970 {
    public List<Integer> powerfulIntegers(int x0, int y0, int bound) {
        Set<Integer> s = new HashSet<>();
        for (int x = 1, y = 1; x + y <= bound; x *= x0, y = 1) {
            for (; x + y <= bound; y *= y0) {
                s.add(x + y);
                if (y0 == 1) break;
            }
            if (x0 == 1) break;
        }
        return new ArrayList<>(s);
    }
}