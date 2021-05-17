package problems;

/**
 * Incremental Memory Leak
 */
public class s1860 {
    public int[] memLeak(int m1, int m2) {
        int i = 1;
        for (; i <= m1 || i <= m2; i++)
            if (m1 >= m2)
                m1 -= i;
            else m2 -= i;
        return new int[]{i, m1, m2};
    }
}