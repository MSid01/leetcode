package problems;

/**
 * Maximum Population Year
 */
public class s1854 {
    public int maximumPopulation(int[][] logs) {
        int a[] = new int[2051], r = 0;
        for (int[] log : logs) {
            a[log[0]]++;
            a[log[1]]--;
        }
        for (int y = 1950; y < a.length; y++) {
            a[y] += a[y - 1];
            r = a[y] > a[r] ? y : r;
        }
        return r;
    }
}