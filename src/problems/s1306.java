package problems;

/**
 * Jump Game III
 */
public class s1306 {
    public boolean canReach(int[] a, int i) {
        return 0 <= i && i < a.length && a[i] >= 0 && ((a[i] = -a[i]) == 0 || canReach(a, i - a[i]) || canReach(a, i + a[i]));
    }
}