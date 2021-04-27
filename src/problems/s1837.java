package problems;

/**
 * Sum of Digits in Base K
 */
public class s1837 {
    public int sumBase(int n, int k) {
        return n < k ? n : n % k + sumBase(n / k, k);
    }
}