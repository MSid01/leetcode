package problems;

/**
 * Largest Multiple of Three
 */
public class s1363 {
    public String largestMultipleOfThree(int[] digits) {
        int mod[][] = new int[][]{{1, 4, 7, 2, 5, 8}, {2, 5, 8, 1, 4, 7}}, sum = 0, c[] = new int[10];
        for (int d : digits) {
            c[d]++;
            sum += d;
        }
        while (sum % 3 != 0)
            for (int i : mod[sum % 3 - 1])
                if (c[i] > 0) {
                    --c[i];
                    sum -= i;
                    break;
                }
        StringBuilder r = new StringBuilder();
        for (int d = 9; d >= 0; d--)
            r.append(String.valueOf(d).repeat(c[d]));
        return r.length() == 0 || r.charAt(0) != '0' ? r.toString() : "0";
    }
}