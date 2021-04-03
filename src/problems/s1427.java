package problems;

/**
 * Perform String Shifts
 */
public class s1427 {
    public String stringShift(String str, int[][] shifts) {
        int offset = 0, n = str.length();
        for (int[] s : shifts)
            offset = (offset + (s[0] == 0 ? s[1] : -s[1])) % n;
        offset = offset >= 0 ? offset : n + offset;
        return str.substring(offset) + str.substring(0, offset);
    }
}
