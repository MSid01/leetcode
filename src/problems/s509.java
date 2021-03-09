package problems;

/**
 * Fibonacci Number
 */
public class s509 {
    public int fib(int n) {
        int[] f = {0, 1};
        for (int i = 2; i <= n; i++)
            f[i % 2] = f[0] + f[1];
        return f[n % 2];
    }
}
