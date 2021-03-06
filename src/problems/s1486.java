package problems;

/**
 * XOR Operation in an Array
 */
public class s1486 {
    public int xorOperation(int n, int start) {
        int r = 0;
        for (int i = 0; i < n; i++)
            r ^= start + 2 * i;
        return r;
    }
}
