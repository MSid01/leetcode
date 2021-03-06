package problems;

/**
 * Maximum Product of Two Elements in an Array
 */
public class s1464 {
    public int maxProduct(int[] a) {
        int m1 = 0, m2 = 0;
        for (int m : a)
            if (m > m2) {
                m1 = m2;
                m2 = m;
            } else m1 = Math.max(m1, m);
        return (m1 - 1) * (m2 - 1);
    }
}
