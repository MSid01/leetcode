package problems;

import java.util.HashMap;
import java.util.Map;

public class s1525 {
    public int numSplits1(String s) {
        Map<Character, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();
        int r = 0;
        for (int i = 0; i < s.length(); i++)
            m2.put(s.charAt(i), m2.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < s.length() && m1.size() <= m2.size(); i++) {
            char c = s.charAt(i);
            m1.put(c, m1.getOrDefault(c, 0) + 1);
            m2.put(c, m2.get(c) - 1);
            if (m2.get(c) == 0)
                m2.remove(c);
            if (m1.size() == m2.size())
                r++;
        }
        return r;
    }

    public int numSplits(String s) {
        int cR[] = new int[26], cL[] = new int[26], dR = 0, dL = 0, r = 0;
        for (int i = 0; i < s.length(); i++)
            dR += ++cR[s.charAt(i) - 'a'] == 1 ? 1 : 0;
        for (int i = 0; i < s.length() && dL <= dR; i++) {
            dL += ++cL[s.charAt(i) - 'a'] == 1 ? 1 : 0;
            dR -= --cR[s.charAt(i) - 'a'] == 0 ? 1 : 0;
            r += dL == dR ? 1 : 0;
        }
        return r;
    }
}