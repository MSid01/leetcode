package problems;

/**
 * Largest Unique Number
 */
public class s1133 {
    public int largestUniqueNumber(int[] a) {
        int[] count = new int[1001];
        for (int i : a)
            count[i]++;
        for (int i = count.length - 1; i >= 0; i--)
            if (count[i] == 1)
                return i;
        return -1;
    }
}
