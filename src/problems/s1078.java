package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Occurrences After Bigram
 */
public class s1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> r = new LinkedList<>();
        for (int i = 2; i < words.length; i++)
            if (words[i - 2].equals(first) && words[i - 1].equals(second))
                r.add(words[i]);
        return r.toArray(new String[0]);
    }
}