package problems;

/**
 * Prime Arrangements
 */
public class s1175 {
    public int numPrimeArrangements(int n) {
        int countPrimes = 0;
        for (int i = 2; i <= n; i++)
            if (prime(i))
                countPrimes++;
        return (int) ((f(countPrimes) * f(n - countPrimes)) % 1_000_000_007);
    }

    boolean prime(int i) {
        if (i <= 3) return true;
        for (int f = 2; f <= Math.sqrt(i); f++)
            if (i % f == 0)
                return false;
        return true;
    }

    long f(int n) {
        long r = 1;
        while (n > 1)
            r = (r * n--) % 1_000_000_007;
        return r;
    }
}
