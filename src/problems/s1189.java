package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Maximum Number of Balloons
 */
public class s1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> balloon = Map.of('b', 1, 'a', 1, 'l', 2, 'o', 2, 'n', 1), m = new HashMap<>();
        for (char c : text.toCharArray())
            if (balloon.containsKey(c))
                m.put(c, m.getOrDefault(c, 0) + 1);
        int count = 0;
        while (true) {
            for (Character c : balloon.keySet()) {
                m.put(c, m.getOrDefault(c, 0) - balloon.get(c));
                if (m.get(c) < 0)
                    return count;
            }
            count++;
        }
    }
}
