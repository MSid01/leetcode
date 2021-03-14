package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Check if One String Swap Can Make Strings Equal
 */
public class s1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> list = new ArrayList<>(2);
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) {
                list.add(i);
                if (list.size() > 2)
                    return false;
            }
        if (list.size() == 0)
            return true;
        if (list.size() != 2)
            return false;
        int i = list.get(0), j = list.get(1);
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}
