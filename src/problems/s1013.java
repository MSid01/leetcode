package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Partition Array Into Three Parts With Equal Sum
 */
public class s1013 {
    public static void main(String[] args) {
        System.out.println(new s1013().canThreePartsEqualSum(new int[]{1, -1, 1, -1}));
    }

    public boolean canThreePartsEqualSum(int[] a) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        int[] cs = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            cs[i + 1] = cs[i] + a[i];
            m.putIfAbsent(cs[i + 1], new ArrayList<>());
            m.get(cs[i + 1]).add(i);
        }
        for (int i = a.length - 1, sum = 0; i > 0; i--) {
            sum += a[i];
            if (m.containsKey(sum)) {
                for (Integer j : m.get(sum)) {
                    if (j + 1 >= i) break;
                    if (cs[i] - cs[j + 1] == sum)
                        return true;
                }
            }
        }
        return false;
    }
}
