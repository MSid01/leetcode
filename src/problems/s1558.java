package problems;

public class s1558 {
    public int minOperations(int[] a) {
        int r = 0, max2 = 1;
        for (int i : a) {
            int bits = 0;
            while (i > 0) {
                r += i & 1;
                bits++;
                i >>= 1;
            }
            max2 = Math.max(max2, bits);
        }
        return r + max2 - 1;
    }
}