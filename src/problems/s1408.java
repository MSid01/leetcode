package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * String Matching in an Array
 */
public class s1408 {
    public List<String> stringMatching(String[] words) {
        List<String> r = new LinkedList<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (int i = 0; i < words.length; i++)
            for (int j = words.length - 1; j > i; j--)
                if (words[j].contains(words[i])) {
                    r.add(words[i]);
                    break;
                }
        return r;
    }
}
