package problems;

/**
 * N-th Tribonacci Number
 */
public class s1137 {
    public int tribonacci(int n) {
        int a[] = {0, 1, 1}, i = 2;
        while (n > i) {
            int next = a[0] + a[1] + a[2];
            a[0] = a[1];
            a[1] = a[2];
            a[2] = next;
            n--;
        }
        return a[n];
    }
}
