package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Check If N and Its Double Exist
 */
public class s1346 {
    public boolean checkIfExist(int[] a) {
        Set<Integer> elements = new HashSet<>(), doubles = new HashSet<>();
        for (int i : a) {
            if (doubles.contains(i) || elements.contains(2 * i))
                return true;
            doubles.add(2 * i);
            elements.add(i);
        }
        return false;
    }
}
