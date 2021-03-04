package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Destination City
 */
public class s1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, String> m = new HashMap<>();
        for (List<String> p : paths)
            m.put(p.get(0), p.get(1));
        String dest = paths.get(0).get(0);
        while (m.containsKey(dest))
            dest = m.get(dest);
        return dest;

    }
}
