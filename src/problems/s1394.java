package problems;

/**
 * Find Lucky Integer in an Array
 */
public class s1394 {
    public int findLucky(int[] a) {
        int[] count = new int[501];
        for (int i : a)
            count[i]++;
        for (int i = count.length - 1; i > 0; i--)
            if (count[i] == i)
                return i;
        return -1;
    }
}
