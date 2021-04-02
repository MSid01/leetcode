package problems;

/**
 * Find Smallest Common Element in All Rows
 */
public class s1198 {
    public int smallestCommonElement(int[][] m) {
        int count[] = new int[10_001], n = m.length;
        for (int[] row : m)
            for (int i : row)
                if (++count[i] == n)
                    return i;
        return -1;
    }
}
