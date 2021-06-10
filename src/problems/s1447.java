package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Simplified Fractions
 */
public class s1447 {
    public List<String> simplifiedFractions(int num) {
        List<String> r = new ArrayList<>();
        for (int d = 2; d <= num; d++)
            for (int n = 1; n < d; n++)
                if (gcd(d, n) == 1)
                    r.add(n + "/" + d);
        return new ArrayList<>(r);
    }

    int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b);}
}