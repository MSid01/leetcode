package problems;

/**
 * The kth Factor of n
 */
public class s1492 {
    public int kthFactor(int n, int k) {
        double sqrt = Math.sqrt(n);
        for (int i = 1; i < sqrt; i++)
            if (n % i == 0 && --k == 0)
                return i;
        for (int i = (int) sqrt; i > 0; i--)
            if (n % i == 0 && --k == 0)
                return n / i;
        return -1;
    }
}