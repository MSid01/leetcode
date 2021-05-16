package problems;

/**
 * Sum of All Subset XOR Totals
 */
public class s1863 {
    public int subsetXORSum(int[] a) {
        int r = 0;
        for (int i = 1; i < (1 << a.length); i++) {
            int total = 0;
            for (int j = 0; j < a.length; j++)
                if ((i & (1 << j)) > 0)
                    total ^= a[j];
            r += total;
        }
        return r;
    }
}