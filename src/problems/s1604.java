package problems;

import java.util.*;

/**
 * Alert Using Same Key-Card Three or More Times in a One Hour Period
 */
public class s1604 {
    public List<String> alertNames(String[] names, String[] times) {
        Map<String, Set<Integer>> m = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            int time = Integer.parseInt(times[i].substring(0, 2)) * 60 + Integer.parseInt(times[i].substring(3));
            m.computeIfAbsent(names[i], s -> new TreeSet<>()).add(time);
        }
        Set<String> r = new TreeSet<>();
        for (String name : m.keySet()) {
            List<Integer> list = new ArrayList<>(m.get(name));
            for (int i = 2; i < list.size(); i++)
                if (list.get(i) - list.get(i - 2) <= 60) {
                    r.add(name);
                    break;
                }
        }
        return new ArrayList<>(r);
    }
}