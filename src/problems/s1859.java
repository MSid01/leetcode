package problems;

import java.util.Arrays;

/**
 * Sorting the Sentence
 */
public class s1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" "), sorted = new String[words.length];
        Arrays.stream(words).forEach(w -> sorted[w.charAt(w.length() - 1) - '1'] = w.substring(0, w.length() - 1));
        return String.join(" ", sorted);
    }
}