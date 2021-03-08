package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Design Underground System
 */
public class s1396 {
    class UndergroundSystem {
        Map<Integer, Entry> checkIn = new HashMap<>();
        Map<String, Double> sum = new HashMap<>();
        Map<String, Integer> n = new HashMap<>();

        public void checkIn(int id, String startStation, int t) {
            checkIn.put(id, new Entry(startStation, t));
        }

        public void checkOut(int id, String endStation, int t) {
            Entry entry = checkIn.get(id);
            String key = entry.station + "_" + endStation;
            sum.put(key, sum.getOrDefault(key, 0.0) + t - entry.t);
            n.put(key, n.getOrDefault(key, 0) + 1);
        }

        public double getAverageTime(String startStation, String endStation) {
            String key = startStation + "_" + endStation;
            return sum.get(key) / n.get(key);
        }

        class Entry {
            String station;
            int t;

            public Entry(String name, int t) {
                this.station = name;
                this.t = t;
            }
        }
    }
}
