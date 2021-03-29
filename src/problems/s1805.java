package problems;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Number of Different Integers in a String
 */
public class s1805 {
    public int numDifferentIntegers(String word) {
        return Arrays.stream(word.split("\\D+")).filter(w -> !w.isBlank()).map(w -> w.replaceFirst("^0+", "")).collect(Collectors.toSet()).size();
    }
}
