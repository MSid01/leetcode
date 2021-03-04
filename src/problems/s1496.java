package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Path Crossing
 */
public class s1496 {
    public boolean isPathCrossing(String path) {
        Set<Integer> s = new HashSet<>();
        s.add(0);
        for (int i = 0, x = 0, y = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'N')
                y++;
            else if (c == 'S')
                y--;
            else if (c == 'E')
                x++;
            else if (c == 'W')
                x--;
            if (!s.add(x * 10_000 + y))
                return true;
        }
        return false;
    }
}