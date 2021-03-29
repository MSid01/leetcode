package problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Evaluate the Bracket Pairs of a String
 */
public class s1807 {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> d = knowledge.stream().collect(Collectors.toMap(k -> k.get(0), k -> k.get(1)));
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(++i) != ')') ;
                r.append(d.getOrDefault(s.substring(j, i), "?"));
            } else r.append(s.charAt(i));
        return r.toString();
    }
}
