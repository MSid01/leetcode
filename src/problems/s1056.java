package problems;

import java.util.Map;

/**
 * Confusing Number
 */
public class s1056 {
    public boolean confusingNumber(int N) {
        var m = Map.of(0, 0, 1, 1, 6, 9, 8, 8, 9, 6);
        int n = N, r = 0;
        while (n > 0) {
            int d = n % 10;
            if (!m.containsKey(d))
                return false;
            r = r * 10 + m.get(d);
            n /= 10;
        }
        return r != N;
    }
}