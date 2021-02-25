package problems;

/**
 * Calculate Money in Leetcode Bank
 */
public class s1716 {
    public int totalMoney(int n) {
        int total = 0;
        for (int day = 0, start = 1; n > 0; day = (day + 1) % 7, n--, start++) {
            total += start;
            if (day == 6)
                start -= day;
        }
        return total;
    }
}
