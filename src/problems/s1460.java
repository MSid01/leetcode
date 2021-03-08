package problems;

/**
 * Make Two Arrays Equal by Reversing Sub-arrays
 */
public class s1460 {
    public boolean canBeEqual(int[] t, int[] a) {
        int[] f = new int[1_001];
        for (int i = 0; i < a.length; i++) {
            f[a[i]]++;
            f[t[i]]--;
        }
        for (int i : f)
            if (i != 0)
                return false;
        return true;
    }
}
