package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Maximum Length of a Concatenated String with Unique Characters
 */
public class s1239 {
    public int maxLength(List<String> arr) {
        List<String> uniq = new ArrayList<>(arr.size());
        List<Integer> masks = new ArrayList<>(arr.size());
        for (String w : arr) {
            int mask = 0, dup = 0;
            for (char c : w.toCharArray()) {
                dup |= mask & (1 << c - 'a');
                mask |= 1 << c - 'a';
            }
            if (dup == 0) {
                uniq.add(w);
                masks.add(mask);
            }
        }
        return dfs(uniq, masks, 0, 0);
    }

    int dfs(List<String> a, List<Integer> masks, int start, int mask) {
        int r = 0;
        for (int i = start; i < a.size(); i++)
            if ((mask & masks.get(i)) == 0) {
                int count = a.get(i).length() + dfs(a, masks, i + 1, mask | masks.get(i));
                r = Math.max(r, count);
            }
        return r;
    }
}