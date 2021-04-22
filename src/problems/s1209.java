package problems;

/**
 * Remove All Adjacent Duplicates in String II
 */
public class s1209 {
    public String removeDuplicates(String s, int k) {
        char[] r = s.toCharArray();
        int i = 0, count[] = new int[r.length];
        for (int j = 0; j < s.length(); j++, i++) {
            r[i] = r[j];
            count[i] = i > 0 && r[i - 1] == r[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) i -= k;
        }
        return new String(r, 0, i);
    }
}