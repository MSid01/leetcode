package problems;

/**
 * Check if Number is a Sum of Powers of Three
 */
public class s1780 {
    public boolean checkPowersOfThree(int n) {
        if (n == 1) return true;
        if (n % 3 == 1)
            return checkPowersOfThree((n - 1) / 3);
        if (n % 3 == 0)
            return checkPowersOfThree(n / 3);
        return false;
    }
}
