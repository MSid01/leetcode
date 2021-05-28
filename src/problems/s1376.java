package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Time Needed to Inform All Employees
 */
public class s1376 {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, Set<Integer>> managerMap = new HashMap<>();
        for (int i = 0; i < n; i++)
            if (manager[i] != -1) {
                managerMap.putIfAbsent(manager[i], new HashSet<>());
                managerMap.get(manager[i]).add(i);
            }
        return dfs(headID, managerMap, informTime);
    }

    int dfs(int id, Map<Integer, Set<Integer>> manager, int[] time) {
        Set<Integer> subs = manager.get(id);
        int max = 0;
        if (subs != null)
            for (Integer sub : subs)
                max = Math.max(max, dfs(sub, manager, time));
        return max + time[id];
    }
}