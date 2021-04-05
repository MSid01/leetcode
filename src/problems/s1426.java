package problems;

/**
 * Counting Elements
 */
public class s1426 {
    public int countElements(int[] a) {
        int f[] = new int[1_001], r = 0;
        for (int i : a)
            f[i]++;
        for (int i = 1; i < f.length; i++)
            if (f[i] > 0)
                r += f[i - 1];
        return r;
    }
}
