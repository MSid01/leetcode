package problems;

/**
 * Sum of All Odd Length Subarrays
 */
public class s1588 {
    public int sumOddLengthSubarrays(int[] a) {
        int sum = 0;
        for (int len = 1; len <= a.length; len += 2)
            for (int i = 0; i < a.length; i++)
                if (len + i <= a.length)
                    for (int j = i; j < len + i; j++)
                        sum += a[j];
        return sum;
    }
}
