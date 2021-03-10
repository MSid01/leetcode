package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Build an Array With Stack Operations
 */
public class s1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> r = new LinkedList<>();
        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
            r.add("Push");
            if (target[j] == i)
                j++;
            else r.add("Pop");
        }
        return r;
    }
}
