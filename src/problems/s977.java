package problems;

/**
 * Squares of a Sorted Array
 */
public class s977 {
    public int[] sortedSquares(int[] a) {
        int[] r = new int[a.length];
        for (int left = 0, right = a.length - 1, i = a.length - 1; i >= 0; i--)
            r[i] = Math.abs(a[left]) >= Math.abs(a[right]) ? a[left] * a[left++] : a[right] * a[right--];
        return r;
    }
}
