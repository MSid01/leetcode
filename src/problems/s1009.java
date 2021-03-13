package problems;

/**
 * Complement of Base 10 Integer
 */
public class s1009 {
    public int bitwiseComplement(int N) {
        int x = 1;
        while (x < N)
            x = x * 2 + 1;
        return x ^ N;
    }
}