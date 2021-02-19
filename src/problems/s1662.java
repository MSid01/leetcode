package problems;

/**
 * Check If Two String Arrays are Equivalent
 */
public class s1662 {
    public boolean arrayStringsAreEqual(String[] words1, String[] words2) {
        int i1 = 0, i2 = 0, j1 = 0, j2 = 0;
        while (i1 < words1.length && i2 < words2.length) {
            if (words1[i1].charAt(j1++) != words2[i2].charAt(j2++))
                return false;
            if (j1 >= words1[i1].length()) {
                i1++;
                j1 = 0;
            }
            if (j2 >= words2[i2].length()) {
                i2++;
                j2 = 0;
            }
        }
        return i1 == words1.length && i2 == words2.length;
    }
}
