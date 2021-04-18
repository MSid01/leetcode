package problems;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Rearrange Words in a Sentence
 */
public class s1451 {
    public String arrangeWords(String text) {
        String[] words = text.split(" ");
        words[0] = words[0].toLowerCase();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
        return String.join(" ", words);
    }
}