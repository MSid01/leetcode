package problems;

/**
 * Second Largest Digit in a String
 */
public class s1796 {
    public int secondHighest(String s) {
        int max = -1, secondMax = -1;
        for (char c : s.toCharArray())
            if (Character.isDigit(c)) {
                int d = c - '0';
                if (d > max) {
                    secondMax = max;
                    max = d;
                } else if (secondMax < d && d < max)
                    secondMax = d;
            }
        return secondMax;
    }
}