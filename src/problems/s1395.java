package problems;

/**
 * Count Number of Teams
 */
public class s1395 {
    public int numTeams(int[] a) {
        int r = 0;
        for (int i = 1; i < a.length; i++) {
            int less[] = new int[2], greater[] = new int[2];
            for (int j = 0, idx = 0; j < a.length; j++, idx = j > i ? 1 : 0)
                if (a[i] < a[j])
                    ++less[idx];
                else if (a[i] > a[j])
                    ++greater[idx];
            r += less[0] * greater[1] + greater[0] * less[1];
        }
        return r;
    }
}