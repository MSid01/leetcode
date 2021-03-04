package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Reformat The String
 */
public class s1417 {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>(s.length() / 2), digits = new ArrayList<>(s.length() / 2);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                digits.add(c);
            else letters.add(c);
        }
        List<Character> bigger = letters.size() >= digits.size() ? letters : digits;
        List<Character> smaller = bigger == letters ? digits : letters;
        if (bigger.size() - smaller.size() > 1) return "";
        StringBuilder r = new StringBuilder();
        int i = 0;
        for (; i < smaller.size(); i++)
            r.append(bigger.get(i)).append(smaller.get(i));
        if (i < bigger.size())
            r.append(bigger.get(i));
        return null;
    }
}
