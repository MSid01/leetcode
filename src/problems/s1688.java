package problems;

/**
 * Count of Matches in Tournament
 */
public class s1688 {

    public int numberOfMatches(int n) {
        if (n == 1) return 0;
        return n % 2 == 1 ? (n - 1) / 2 + numberOfMatches(1 + n / 2) : n / 2 + numberOfMatches(n / 2);
    }
}