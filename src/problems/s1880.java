package problems;

/**
 * Check if Word Equals Summation of Two Words
 */
public class s1880 {
    public boolean isSumEqual(String w1, String w2, String w3) {
        return toInt(w1) + toInt(w2) == toInt(w3);
    }

    int toInt(String w) {
        int r = 0;
        for (char c : w.toCharArray())
            r = r * 10 + (c - 'a');
        return r;
    }
}