package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Snapshot Array
 */
public class s1146 {
    class SnapshotArray {
        final Map<Integer, Map<Integer, Integer>> snaps = new HashMap<>();
        int snapId = 0;

        public SnapshotArray(int len) {
            snaps.put(snapId, new HashMap<>());
        }

        public void set(int index, int val) {
            snaps.get(snapId).put(index, val);
        }

        public int snap() {
            snaps.put(snapId + 1, new HashMap<>());
            return snapId++;
        }

        public int get(int index, int snapId) {
            for (; snapId >= 0; snapId--)
                if (snaps.get(snapId).get(index) != null)
                    return snaps.get(snapId).get(index);
            return 0;
        }
    }
}