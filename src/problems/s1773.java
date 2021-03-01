package problems;

import java.util.List;
import java.util.Map;

/**
 * Count Items Matching a Rule
 */
public class s1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int  key = Map.of("type", 0, "color", 1, "name", 2).get(ruleKey);
        return (int) items.stream().filter(i -> i.get(key).equals(ruleValue)).count();
    }
}
