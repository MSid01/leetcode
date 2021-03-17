package problems;

/**
 * Element Appearing More Than 25% In Sorted Array
 */
public class s1287 {
    public int findSpecialInteger(int[] a) {
        for (int i = 0, len = a.length / 4; i < a.length - len; i++)
            if (a[i] == a[i + len])
                return a[i];
        return -1;
    }
}