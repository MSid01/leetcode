package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Display Table of Food Orders in a Restaurant
 */
public class s1418 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<Integer, TreeMap<String, Integer>> t = new TreeMap<>();
        TreeSet<String> foods = new TreeSet<>();
        for (List<String> o : orders) {
            int id = Integer.parseInt(o.get(1));
            String food = o.get(2);
            foods.add(food);
            t.putIfAbsent(id, new TreeMap<>());
            t.get(id).put(food, t.get(id).getOrDefault(food, 0) + 1);
        }
        List<List<String>> r = new ArrayList<>(t.size());
        r.add(new ArrayList<>(foods));
        r.get(0).add(0, "Table");
        for (Integer id : t.keySet()) {
            List<String> list = new ArrayList<>(foods.size() + 1);
            list.add(String.valueOf(id));
            for (String food : foods)
                list.add(String.valueOf(t.get(id).getOrDefault(food, 0)));
            r.add(list);
        }
        return r;
    }
}
