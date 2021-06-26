package problems;

/**
 * Remove One Element to Make the Array Strictly Increasing
 */
public class s1909 {
    public boolean canBeIncreasing(int[] a) {
        int nDel = 0, delIdx = -1;
        for (int i = 1; i < a.length; i++)
            if (a[i - 1] >= a[i]) {
                nDel++;
                delIdx = i;
            }
        if (nDel > 1)
            return false;
        if (nDel == 0 || delIdx == a.length - 1 || delIdx == 1)
            return true;
        return a[delIdx - 1] < a[delIdx + 1] || a[delIdx - 2] < a[delIdx];
    }
}