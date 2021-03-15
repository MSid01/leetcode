package problems;

import java.util.*;

/**
 * Group the People Given the Group Size They Belong To
 */
public class s1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> groups = new HashMap<>();
        List<List<Integer>> r = new LinkedList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            groups.putIfAbsent(size, new ArrayList<>(size));
            groups.get(size).add(i);
            if (groups.get(size).size() == size) {
                r.add(groups.get(size));
                groups.put(size, new ArrayList<>(size));
            }
        }
        return r;
    }
}