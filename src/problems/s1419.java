package problems;

/**
 * Minimum Number of Frogs Croaking
 */
public class s1419 {
    public int minNumberOfFrogs(String s) {
        int r = 0, curr = 0, count[] = new int[5];
        for (char c : s.toCharArray()) {
            int i = "croak".indexOf(c);
            count[i]++;
            if (i == 0)
                r = Math.max(r, ++curr);
            else if (--count[i - 1] < 0)
                return -1;
            else if (i == count.length - 1)
                --curr;
        }
        return curr == 0 ? r : -1;
    }
}