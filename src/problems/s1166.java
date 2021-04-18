package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Design File System
 */
public class s1166 {
    class FileSystem {
        Map<String, Integer> m = new HashMap<>();

        public boolean createPath(String path, int value) {
            if (m.containsKey(path))
                return false;
            String parent = path.substring(0, path.lastIndexOf("/"));
            if (parent.isBlank() || m.containsKey(parent)) {
                m.put(path, value);
                return true;
            }
            return false;
        }

        public int get(String path) { return m.getOrDefault(path, -1);}
    }
}
