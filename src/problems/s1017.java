package problems;

/**
 * Convert to Base -2
 */
public class s1017 {
    public String baseNeg2(int n) {
        StringBuilder r = new StringBuilder();
        while (n != 0) {
            r.append(n & 1);
            n = -(n >> 1);
        }
        return r.length() > 0 ? r.reverse().toString() : "0";
    }
}