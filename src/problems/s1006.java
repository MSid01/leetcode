package problems;

/**
 * Clumsy Factorial
 */
public class s1006 {
    public int clumsy(int n) {
        int r = 0, sign = 1;
        while (n >= 1) {
            int f = n--;
            if (n >= 1)
                f *= n--;
            if (n >= 1)
                f /= n--;
            r = r + sign * f;
            if (n >= 1)
                r += n--;
            sign = -1;
        }
        return r;
    }
}
