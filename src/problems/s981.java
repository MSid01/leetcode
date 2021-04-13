package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class s981 {
    class TimeMap {
        Map<String, TreeMap<Integer, String>> m = new HashMap<>();

        public void set(String key, String value, int timestamp) {
            m.putIfAbsent(key, new TreeMap<>());
            m.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            TreeMap<Integer, String> entries = m.get(key);
            if (entries == null)
                return "";
            Integer prevKey = entries.floorKey(timestamp);
            return prevKey != null ? entries.get(prevKey) : "";
        }
    }
}