package problems;

/**
 * Kth Missing Positive Number
 */
public class s1539 {
    public static void main(String[] args) {
        System.out.println(new s1539().findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
    }

    public int findKthPositive(int[] a, int k) {
        int prev = 0;
        for (int i : a) {
            if (i - prev - 1 >= k)
                return prev + k;
            else k -= i - prev - 1;
            prev = i;
        }
        return prev + k;
    }
}
