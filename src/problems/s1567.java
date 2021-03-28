package problems;

/**
 * Maximum Length of Subarray With Positive Product
 */
public class s1567 {
    public static void main(String[] args) {
        System.out.println(new s1567().getMaxLen(new int[]{0, 1, -2, -3, -4}));
    }

    public int getMaxLen(int[] a) {
        int r = 0, start = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == 0) {
                r = Math.max(r, maxLen(a, start, i - 1));
                start = i + 1;
            }
        return Math.max(r, maxLen(a, start, a.length - 1));
    }

    int maxLen(int[] a, int start, int end) {
        int negatives = 0, left = -1, right = -1;
        for (int i = start; i <= end; i++)
            if (a[i] < 0) {
                negatives++;
                if (left == -1)
                    left = i + 1;
                right = i - 1;
            }
        if (negatives % 2 == 0)
            return end - start + 1;
        return Math.max(end - left + 1, right - start + 1);
    }
}
