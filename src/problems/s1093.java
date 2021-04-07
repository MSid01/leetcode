package problems;

/**
 * Statistics from a Large Sample
 */
public class s1093 {
    public double[] sampleStats(int[] count) {
        double min = -1, max = -1, sum = 0;
        int N = 0, mode = 0;
        for (int n = 0; n < count.length; n++)
            if (count[n] > 0) {
                if (min == -1)
                    min = n;
                max = n;
                if (count[n] > count[mode])
                    mode = n;
                sum += 1.0 * count[n] * n;
                N += count[n];
            }
        int m1 = bisect(count, N / 2), m2 = bisect(count, (N - 1) / 2);
        return new double[]{min, max, sum / N, (m1 + m2) / 2.0, mode};
    }

    int bisect(int[] count, long N) {
        int sum = 0, i = 0;
        for (; i < count.length && sum <= N; i++)
            sum += count[i];
        return i - 1;
    }
}