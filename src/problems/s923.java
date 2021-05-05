package problems;

/**
 * 3Sum With Multiplicity
 */
public class s923 {
    public int threeSumMulti(int[] a, int target) {
        long[] f = new long[101];
        for (int i : a)
            f[i]++;
        long r = 0;
        for (int i = 0; i < f.length; i++)
            for (int j = i; j < f.length; j++) {
                int k = target - i - j;
                if (k > 100 || k < 0)
                    continue;
                if (i == j && j == k)
                    r += f[i] * (f[i] - 1) * (f[i] - 2) / 6;
                else if (i == j)
                    r += f[i] * (f[i] - 1) / 2 * f[k];
                else if (j < k)
                    r += f[i] * f[j] * f[k];
            }
        return (int) (r % 1_000_000_007);
    }
}