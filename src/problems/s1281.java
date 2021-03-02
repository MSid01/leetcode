package problems;

/**
 * Subtract the Product and Sum of Digits of an Integer
 */
public class s1281 {
    public int subtractProductAndSum(int n) {
        int p = 1, s = 0;
        while (n > 0) {
            int d = n % 10;
            p *= d;
            s += d;
            n /= 10;
        }
        return p - s;
    }
}
