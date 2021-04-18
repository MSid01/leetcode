package problems;

/**
 * Minimum Operations to Make the Array Increasing
 */
public class s1827 {
    public int minOperations(int[] a) {
        int ops = 0, prev = 0;
        for (int n : a)
            if (prev >= n)
                ops += ++prev - n;
            else prev = n;
        return ops;
    }
}