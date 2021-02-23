package problems;

/**
 * Three Consecutive Odds
 */
public class s1550 {
    public boolean threeConsecutiveOdds(int[] a) {
        for (int i = 2; i < a.length; i++)
            if ((a[i - 2] & 1) == 1 && (a[i - 1] & 1) == 1 && (a[i] & 1) == 1)
                return true;
        return false;
    }
}
