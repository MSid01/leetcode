package problems;

/**
 * String Without AAA or BBB
 */
public class s984 {
    public String strWithout3a3b(int A, int B) {
        return A >= B ? str(A, B, "a", "b") : str(B, A, "b", "a");
    }

    String str(int A, int B, String a, String b) {
        if (A - 2 > B)
            return a + a + b + str(A - 2, B - 1, a, b);
        StringBuilder r = new StringBuilder(A + B);
        while (B-- > 0 && A-- > 0)
            r.append(a).append(b);
        return r.append(a.repeat(A)).toString();
    }
}