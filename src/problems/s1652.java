package problems;

/**
 * Defuse the Bomb
 */
public class s1652 {
    public int[] decrypt(int[] code, int k) {
        if (k == 0)
            return new int[code.length];
        int r[] = new int[code.length], s = 0, start = k > 0 ? 1 : code.length + k, end = k > 0 ? k : code.length - 1;
        for (int i = start; i <= end; i++)
            s += code[i];
        for (int i = 0; i < code.length; i++) {
            r[i] = s;
            s = s + code[(++end) % code.length] - code[(start++) % code.length];
        }
        return r;
    }
}